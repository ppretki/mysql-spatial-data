/*
 * This file is generated by jOOQ.
 */
package com.ppretki.infrastructure.jooq.tables;


import com.ppretki.infrastructure.jooq.Indexes;
import com.ppretki.infrastructure.jooq.Keys;
import com.ppretki.infrastructure.jooq.Test;
import com.ppretki.infrastructure.jooq.tables.records.EntityWithAreaRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityWithArea extends TableImpl<EntityWithAreaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>test.ENTITY_WITH_AREA</code>
     */
    public static final EntityWithArea ENTITY_WITH_AREA = new EntityWithArea();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntityWithAreaRecord> getRecordType() {
        return EntityWithAreaRecord.class;
    }

    /**
     * The column <code>test.ENTITY_WITH_AREA.tenant_id</code>.
     */
    public final TableField<EntityWithAreaRecord, String> TENANT_ID = createField(DSL.name("tenant_id"), SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>test.ENTITY_WITH_AREA.entity_id</code>.
     */
    public final TableField<EntityWithAreaRecord, String> ENTITY_ID = createField(DSL.name("entity_id"), SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>test.ENTITY_WITH_AREA.description</code>.
     */
    public final TableField<EntityWithAreaRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>test.ENTITY_WITH_AREA.latitude</code>.
     */
    public final TableField<EntityWithAreaRecord, Double> LATITUDE = createField(DSL.name("latitude"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>test.ENTITY_WITH_AREA.longitude</code>.
     */
    public final TableField<EntityWithAreaRecord, Double> LONGITUDE = createField(DSL.name("longitude"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>test.ENTITY_WITH_AREA.radius</code>.
     */
    public final TableField<EntityWithAreaRecord, Integer> RADIUS = createField(DSL.name("radius"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<EntityWithAreaRecord, Object> AREA = createField(DSL.name("area"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"test\".\"ENTITY_WITH_AREA_area\"").nullable(false), this, "");

    private EntityWithArea(Name alias, Table<EntityWithAreaRecord> aliased) {
        this(alias, aliased, null);
    }

    private EntityWithArea(Name alias, Table<EntityWithAreaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>test.ENTITY_WITH_AREA</code> table reference
     */
    public EntityWithArea(String alias) {
        this(DSL.name(alias), ENTITY_WITH_AREA);
    }

    /**
     * Create an aliased <code>test.ENTITY_WITH_AREA</code> table reference
     */
    public EntityWithArea(Name alias) {
        this(alias, ENTITY_WITH_AREA);
    }

    /**
     * Create a <code>test.ENTITY_WITH_AREA</code> table reference
     */
    public EntityWithArea() {
        this(DSL.name("ENTITY_WITH_AREA"), null);
    }

    public <O extends Record> EntityWithArea(Table<O> child, ForeignKey<O, EntityWithAreaRecord> key) {
        super(child, key, ENTITY_WITH_AREA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Test.TEST;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ENTITY_WITH_AREA_AREA);
    }

    @Override
    public UniqueKey<EntityWithAreaRecord> getPrimaryKey() {
        return Keys.KEY_ENTITY_WITH_AREA_PRIMARY;
    }

    @Override
    public EntityWithArea as(String alias) {
        return new EntityWithArea(DSL.name(alias), this);
    }

    @Override
    public EntityWithArea as(Name alias) {
        return new EntityWithArea(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityWithArea rename(String name) {
        return new EntityWithArea(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityWithArea rename(Name name) {
        return new EntityWithArea(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Double, Double, Integer, Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
