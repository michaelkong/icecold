package com.slalom.icecold.repository;

import com.slalom.icecold.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "orders", collectionResourceRel = "orders", itemResourceRel = "order")
public interface OrderRepository extends MongoRepository<Order, String> {
    @Override
    @RestResource(exported = false)
    void delete(Order entity);
}
