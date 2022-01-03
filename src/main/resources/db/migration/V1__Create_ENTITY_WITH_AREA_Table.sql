create table ENTITY_WITH_AREA
(
    tenant_id char(36) NOT NULL,
    entity_id char(36) NOT NULL,
    description varchar(255) NOT NULL,
    latitude DOUBLE PRECISION NOT NULL,
    longitude DOUBLE PRECISION NOT NULL,
    radius integer NOT NULL,
    area GEOMETRY GENERATED ALWAYS AS (ST_BUFFER(ST_SRID(Point(longitude,latitude),4326),radius)) STORED NOT NULL SRID 4326,
    SPATIAL INDEX(area),
    PRIMARY KEY(tenant_id, entity_id)
);