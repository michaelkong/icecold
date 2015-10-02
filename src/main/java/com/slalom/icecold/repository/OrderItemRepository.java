package com.slalom.icecold.repository;

import com.slalom.icecold.domain.OrderItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by michael.kong on 9/25/15.
 */
@RepositoryRestResource(path = "orderItems", collectionResourceRel = "orderItems", itemResourceRel = "orderItem")
public interface OrderItemRepository extends MongoRepository<OrderItem, String> {


}
