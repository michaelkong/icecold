package com.slalom.icecold.repository;

import com.slalom.icecold.domain.OrderItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "orderItems", collectionResourceRel = "orderItems", itemResourceRel = "orderItem")
public interface OrderItemRepository extends MongoRepository<OrderItem, String> {


}
