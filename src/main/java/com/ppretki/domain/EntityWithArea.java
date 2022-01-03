package com.ppretki.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EntityWithArea {
    private final EntityId entityId;
    String description;
    Area area;
}
