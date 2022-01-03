package com.ppretki.infrastructure;

import org.jooq.Context;
import org.jooq.impl.CustomField;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;

import com.ppretki.domain.Center;

public class DistanceFrom extends CustomField<Double> {
    private final Center center;

    protected DistanceFrom(Center center) {
        super(DSL.name("distance"), SQLDataType.DOUBLE);
        this.center = center;
    }

    @Override
    public void accept(Context<?> ctx) {
        ctx.visit(
                DSL.field("ST_Distance(ST_SRID(Point(?,?),4326), ST_SRID(Point(longitude,latitude),4326))", center.getLongitude(),
                        center.getLatitude()));
    }
}
