package com.ppretki.infrastructure;

import lombok.Value;
import lombok.val;

import org.jooq.Context;
import org.jooq.impl.CustomCondition;
import org.jooq.impl.DSL;

import com.ppretki.domain.Area;

@Value
public class EntitiesInsideArea extends CustomCondition {
    private final Area area;

    @Override
    public void accept(Context<?> ctx) {
        val center = area.getCenter();
        ctx.visit(DSL.condition("ST_Intersects(ST_BUFFER(ST_SRID(Point(?,?),4326),?), area)", center.getLongitude(),
                center.getLatitude(), area.getRadius().asMeters()));
    }
}
