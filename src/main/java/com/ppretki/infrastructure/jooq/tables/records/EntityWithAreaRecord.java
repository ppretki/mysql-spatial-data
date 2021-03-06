/*
 * This file is generated by jOOQ.
 */
package com.ppretki.infrastructure.jooq.tables.records;


import com.ppretki.infrastructure.jooq.tables.EntityWithArea;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityWithAreaRecord extends UpdatableRecordImpl<EntityWithAreaRecord> implements Record7<String, String, String, Double, Double, Integer, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>test.ENTITY_WITH_AREA.tenant_id</code>.
     */
    public void setTenantId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.ENTITY_WITH_AREA.tenant_id</code>.
     */
    public String getTenantId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>test.ENTITY_WITH_AREA.entity_id</code>.
     */
    public void setEntityId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.ENTITY_WITH_AREA.entity_id</code>.
     */
    public String getEntityId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.ENTITY_WITH_AREA.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.ENTITY_WITH_AREA.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.ENTITY_WITH_AREA.latitude</code>.
     */
    public void setLatitude(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.ENTITY_WITH_AREA.latitude</code>.
     */
    public Double getLatitude() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>test.ENTITY_WITH_AREA.longitude</code>.
     */
    public void setLongitude(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.ENTITY_WITH_AREA.longitude</code>.
     */
    public Double getLongitude() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>test.ENTITY_WITH_AREA.radius</code>.
     */
    public void setRadius(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>test.ENTITY_WITH_AREA.radius</code>.
     */
    public Integer getRadius() {
        return (Integer) get(5);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public void setArea(Object value) {
        set(6, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public Object getArea() {
        return get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Double, Double, Integer, Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, Double, Double, Integer, Object> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return EntityWithArea.ENTITY_WITH_AREA.TENANT_ID;
    }

    @Override
    public Field<String> field2() {
        return EntityWithArea.ENTITY_WITH_AREA.ENTITY_ID;
    }

    @Override
    public Field<String> field3() {
        return EntityWithArea.ENTITY_WITH_AREA.DESCRIPTION;
    }

    @Override
    public Field<Double> field4() {
        return EntityWithArea.ENTITY_WITH_AREA.LATITUDE;
    }

    @Override
    public Field<Double> field5() {
        return EntityWithArea.ENTITY_WITH_AREA.LONGITUDE;
    }

    @Override
    public Field<Integer> field6() {
        return EntityWithArea.ENTITY_WITH_AREA.RADIUS;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field7() {
        return EntityWithArea.ENTITY_WITH_AREA.AREA;
    }

    @Override
    public String component1() {
        return getTenantId();
    }

    @Override
    public String component2() {
        return getEntityId();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Double component4() {
        return getLatitude();
    }

    @Override
    public Double component5() {
        return getLongitude();
    }

    @Override
    public Integer component6() {
        return getRadius();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object component7() {
        return getArea();
    }

    @Override
    public String value1() {
        return getTenantId();
    }

    @Override
    public String value2() {
        return getEntityId();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Double value4() {
        return getLatitude();
    }

    @Override
    public Double value5() {
        return getLongitude();
    }

    @Override
    public Integer value6() {
        return getRadius();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object value7() {
        return getArea();
    }

    @Override
    public EntityWithAreaRecord value1(String value) {
        setTenantId(value);
        return this;
    }

    @Override
    public EntityWithAreaRecord value2(String value) {
        setEntityId(value);
        return this;
    }

    @Override
    public EntityWithAreaRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public EntityWithAreaRecord value4(Double value) {
        setLatitude(value);
        return this;
    }

    @Override
    public EntityWithAreaRecord value5(Double value) {
        setLongitude(value);
        return this;
    }

    @Override
    public EntityWithAreaRecord value6(Integer value) {
        setRadius(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public EntityWithAreaRecord value7(Object value) {
        setArea(value);
        return this;
    }

    @Override
    public EntityWithAreaRecord values(String value1, String value2, String value3, Double value4, Double value5, Integer value6, Object value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EntityWithAreaRecord
     */
    public EntityWithAreaRecord() {
        super(EntityWithArea.ENTITY_WITH_AREA);
    }

    /**
     * Create a detached, initialised EntityWithAreaRecord
     */
    public EntityWithAreaRecord(String tenantId, String entityId, String description, Double latitude, Double longitude, Integer radius, Object area) {
        super(EntityWithArea.ENTITY_WITH_AREA);

        setTenantId(tenantId);
        setEntityId(entityId);
        setDescription(description);
        setLatitude(latitude);
        setLongitude(longitude);
        setRadius(radius);
        setArea(area);
    }
}
