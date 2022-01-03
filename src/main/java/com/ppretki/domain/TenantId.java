package com.ppretki.domain;

import java.util.UUID;

import lombok.Value;

@Value
public class TenantId {
    String id;
    public static TenantId newInstance(){
        return new TenantId(UUID.randomUUID().toString());
    }
}
