package com.ppretki;

import static com.ppretki.application.GridDefinition.WARSAW;

import lombok.val;

import com.ppretki.application.CreateGrid;
import com.ppretki.domain.Radius;
import com.ppretki.infrastructure.DBMigrator;
import com.ppretki.infrastructure.JooqEntityRepository;

public class Main {

    public static void main(String[] args) {
        DBMigrator.doMigrate();
        val repository = new JooqEntityRepository();
        new CreateGrid(repository).createEntities(WARSAW, Radius.fromMeters(100));
    }
}
