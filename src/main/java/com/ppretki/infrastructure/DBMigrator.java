package com.ppretki.infrastructure;

import org.flywaydb.core.Flyway;

public class DBMigrator {

    public static void doMigrate() {
        Flyway flyway =
                Flyway.configure().dataSource(DBConfiguration.DB_URL, DBConfiguration.DB_USER, DBConfiguration.DB_PASSWORD).load();
        flyway.migrate();
    }

}
