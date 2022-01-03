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
public class CreateGridOfEntities {
    private final EntityRepository entityRepository;

    public void create() {
        entityRepository.clear();

        val radius = Radius.fromMeters(100);
        val nLatitude = 100;
        val nLongitude = 100;
        val rand = new Random();
        val folders = new ArrayList<EntityWithArea>();
        for (int i = 0; i < nLatitude; i++) {
            val latitude = -90.0 + (180.0 / nLatitude) * i;
            for (int j = 0; j < nLongitude; j++) {
                val longitude = makeSureIsGreaterThanMinus180(-180.0 + (360.0 / nLatitude * j));
                val center = Center.builder()
                        .latitude(latitude)
                        .longitude(longitude)
                        .build();
                val folderId = EntityId.builder()
                        .tenantId(new TenantId(String.valueOf(rand.nextInt(20))))
                        .id(randomString())
                        .build();
                val folder = EntityWithArea.builder()
                        .entityId(folderId)
                        .area(new Area(center, radius))
                        .description(randomString())
                        .build();
                folders.add(folder);
            }
        }
        entityRepository.addBatch(folders);
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
