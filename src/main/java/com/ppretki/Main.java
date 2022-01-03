package com.ppretki;

import lombok.val;

import com.ppretki.application.CreateGridOfEntities;
import com.ppretki.infrastructure.DBMigrator;
import com.ppretki.infrastructure.JooqEntityRepository;

public class Main {



    public static void main(String[] args) {
        DBMigrator.doMigrate();
        val repository = new JooqEntityRepository();
        new CreateGridOfEntities(repository).create();
    }
}
