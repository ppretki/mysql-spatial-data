Find all entities inside the area with the center at (lon,lat) and radius R
```sql
SET @R = 100;
SET @lat = 0;
SET @lat = 0;
SET @CENTER = ST_SRID(POINT(@lon, @lat), 4326);
SET @TENANT_ID =1;
SELECT * FROM ENTITY_WITH_AREA
WHERE((ST_INTERSECTS(ST_BUFFER(@CENTER, @R ), area)) AND tenant_id=@TENANT_ID)
ORDER BY ST_DISTANCE(@CENTER, ST_SRID(POINT(longitude, latitude), 4326)) ASC
```

```sql
SELECT * FROM ENTITY_WITH_AREA
WHERE((ST_INTERSECTS(ST_BUFFER(ST_SRID(POINT(10, 10), 4326), 1000 ), area)) AND tenant_id=1)
ORDER BY ST_DISTANCE( ST_SRID(POINT(10, 10), 4326), ST_SRID(POINT(longitude, latitude), 4326)) ASC
```