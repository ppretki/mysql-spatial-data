package com.ppretki.domain;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class EntityId {
    TenantId tenantId;
    String id;

    public static EntityId newInstance() {
        return new EntityId(TenantId.newInstance(), UUID.randomUUID().toString());
    }
}
