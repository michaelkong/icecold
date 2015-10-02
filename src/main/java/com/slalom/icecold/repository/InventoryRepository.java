package com.slalom.icecold.repository;

import com.slalom.icecold.domain.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "inventory", collectionResourceRel = "inventory", itemResourceRel = "inventory")
public interface InventoryRepository extends MongoRepository<Inventory, String> {
    @Override
    @RestResource(exported = false)
    void delete(Inventory entity);
}
