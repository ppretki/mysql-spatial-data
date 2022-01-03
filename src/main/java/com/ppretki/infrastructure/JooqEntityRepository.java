package com.ppretki.infrastructure;

import static com.ppretki.infrastructure.jooq.tables.EntityWithArea.ENTITY_WITH_AREA;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.SneakyThrows;
import lombok.val;

import org.jooq.DSLContext;
import org.jooq.Query;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

import com.ppretki.domain.Area;
import com.ppretki.domain.Center;
import com.ppretki.domain.EntityWithArea;
import com.ppretki.domain.EntityId;
import com.ppretki.domain.EntityRepository;
import com.ppretki.domain.Radius;
import com.ppretki.domain.TenantId;

public class JooqEntityRepository implements EntityRepository {

    @SneakyThrows
    private static DSLContext context() {

        Settings settings = new Settings()
                .withBatchSize(1000)
                .withRenderFormatted(false);
        return DSL.using(HikariCPDataSource.getDataSource(), SQLDialect.MYSQL, settings);
    }

    @Override
    public Optional<EntityWithArea> findById(EntityId entityId) {
        DSLContext context = context();
        context.select(ENTITY_WITH_AREA.ENTITY_ID).from(ENTITY_WITH_AREA).fetch();
        return Optional.empty();
    }

    public void add(EntityWithArea entityWithArea) {
        DSLContext context = context();

        val center = entityWithArea.getArea().getCenter();
        val record = context.newRecord(ENTITY_WITH_AREA);
        record.setLatitude(center.getLatitude());
        record.setLongitude(center.getLongitude());
        record.setRadius(entityWithArea.getArea().getRadius().asMeters());
        record.setEntityId(entityWithArea.getEntityId().getId());
        record.setTenantId(entityWithArea.getEntityId().getTenantId().getId());
        record.setDescription(entityWithArea.getDescription());
        record.store();
    }

    @Override
    public void addBatch(List<EntityWithArea> entityWithAreas) {
        DSLContext context = context();
        val queries = entityWithAreas.stream().map(toInsertInto(context)).collect(Collectors.toList());
        context.batch(queries).execute();
    }

    private Function<EntityWithArea, Query> toInsertInto(DSLContext context){
        return entityWithArea -> context.insertInto(ENTITY_WITH_AREA, ENTITY_WITH_AREA.ENTITY_ID, ENTITY_WITH_AREA.TENANT_ID, ENTITY_WITH_AREA.DESCRIPTION, ENTITY_WITH_AREA.LATITUDE, ENTITY_WITH_AREA.LONGITUDE, ENTITY_WITH_AREA.RADIUS)
                .values(entityWithArea.getEntityId().getId(), entityWithArea.getEntityId().getTenantId().getId(), entityWithArea.getDescription(), entityWithArea
                        .getArea().getCenter().getLatitude(), entityWithArea.getArea().getCenter().getLongitude(), entityWithArea.getArea().getRadius().asMeters());
    }


    @Override
    public List<EntityWithArea> findAllInsideArea(TenantId tenantId, Area area) {
        DSLContext context = context();
        val center = area.getCenter();
        return context.select(ENTITY_WITH_AREA.asterisk(), new DistanceFrom(center))
                .from(ENTITY_WITH_AREA)
                .where(new EntitiesInsideArea(area))
                .and(ENTITY_WITH_AREA.TENANT_ID.eq(tenantId.getId()))
                .orderBy(new DistanceFrom(center).desc())
                .fetch()
                .stream()
                .map(this::toFolder)
                .collect(Collectors.toList());
    }

    @Override
    public void clear() {
        context().deleteFrom(ENTITY_WITH_AREA).execute();
    }

    private EntityWithArea toFolder(Record record) {
        val folderId = EntityId.builder()
                .id(record.get(ENTITY_WITH_AREA.ENTITY_ID))
                .tenantId(new TenantId(record.get(ENTITY_WITH_AREA.TENANT_ID)))
                .build();
        val center = Center.builder()
                .latitude(record.get(ENTITY_WITH_AREA.LATITUDE))
                .longitude(record.get(ENTITY_WITH_AREA.LONGITUDE))
                .build();
        val area = Area.builder()
                .radius(new Radius(record.get(ENTITY_WITH_AREA.RADIUS)))
                .center(center)
                .build();
        return EntityWithArea.builder()
                .description(record.get(ENTITY_WITH_AREA.DESCRIPTION))
                .area(area)
                .entityId(folderId)
                .build();
    }

}
