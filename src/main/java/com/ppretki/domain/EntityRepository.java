package com.ppretki.domain;

import java.util.List;
import java.util.Optional;

public interface EntityRepository {
    Optional<EntityWithArea> findById(EntityId entityId);
    void add(EntityWithArea entityWithArea);
    void addBatch(List<EntityWithArea> entityWithAreas);
    List<EntityWithArea> findAllInsideArea(TenantId tenantId, Area area);
    void clear();
}
