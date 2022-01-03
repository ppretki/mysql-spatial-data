package com.ppretki.application;

import lombok.RequiredArgsConstructor;
import lombok.val;

import com.ppretki.domain.Area;
import com.ppretki.domain.Center;
import com.ppretki.domain.EntityRepository;
import com.ppretki.domain.Radius;
import com.ppretki.domain.TenantId;

@RequiredArgsConstructor
public class FindEntity {
    private final EntityRepository entityRepository;

    public void findAll() {
        val area = Area.builder()
                .center(new Center(0.0, 0.0))
                .radius(new Radius(1000000))
                .build();

        entityRepository.findAllInsideArea(new TenantId("1"), area).forEach(System.out::println);
    }
}
