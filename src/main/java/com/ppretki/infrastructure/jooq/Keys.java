/*
 * This file is generated by jOOQ.
 */
package com.ppretki.infrastructure.jooq;


import com.ppretki.infrastructure.jooq.tables.EntityWithArea;
import com.ppretki.infrastructure.jooq.tables.records.EntityWithAreaRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * test.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<EntityWithAreaRecord> KEY_ENTITY_WITH_AREA_PRIMARY = Internal.createUniqueKey(EntityWithArea.ENTITY_WITH_AREA, DSL.name("KEY_ENTITY_WITH_AREA_PRIMARY"), new TableField[] { EntityWithArea.ENTITY_WITH_AREA.TENANT_ID, EntityWithArea.ENTITY_WITH_AREA.ENTITY_ID }, true);
}