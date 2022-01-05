package com.ppretki.application;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import lombok.RequiredArgsConstructor;
import lombok.val;

import com.ppretki.domain.Area;
import com.ppretki.domain.EntityWithArea;
import com.ppretki.domain.EntityId;
import com.ppretki.domain.EntityRepository;
import com.ppretki.domain.Center;
import com.ppretki.domain.Radius;
import com.ppretki.domain.TenantId;

@RequiredArgsConstructor
public class CreateGrid {
    private final EntityRepository entityRepository;
    private final Random rand = new Random();

    public void createEntities(GridDefinition gridDefinition, Radius radius) {
        entityRepository.clear();
        val nLatitude = gridDefinition.getNumberOfVerticalPoints();
        val nLongitude = gridDefinition.getNumberOfHorizontalPoints();
        val entities = new ArrayList<EntityWithArea>();
        val minLat = gridDefinition.getMinLatitude();
        val maxLat = gridDefinition.getMaxLatitude();
        val maxLong = gridDefinition.getMaxLongitude();
        val minLong = gridDefinition.getMinLongitude();

        for (int i = 0; i < nLatitude; i++) {
            val latitude = minLat + ((maxLat - minLat) / nLatitude) * i;
            for (int j = 0; j < nLongitude; j++) {
                val longitude = makeSureIsGreaterThanMinus180(minLong + ((maxLong - minLong) / nLatitude * j));
                entities.add(createEntity(latitude, longitude, radius));
            }
        }
        entityRepository.addBatch(entities);
    }

    private EntityWithArea createEntity(double latitude, double longitude, Radius radius) {
        val center = Center.builder()
                .latitude(latitude)
                .longitude(longitude)
                .build();
        val folderId = EntityId.builder()
                .tenantId(new TenantId(String.valueOf(rand.nextInt(20))))
                .id(randomString())
                .build();
        return EntityWithArea.builder()
                .entityId(folderId)
                .area(new Area(center, radius))
                .description(randomString())
                .build();
    }

    private String randomString() {
        return UUID.randomUUID().toString();
    }

    private double makeSureIsGreaterThanMinus180(double v) {
        return v == -180.0
                ? -179.99
                : v;
    }

}
