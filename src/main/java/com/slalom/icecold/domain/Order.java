package com.slalom.icecold.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;


public class Order {
    @Id
    private String id;

    @DBRef
    private List<OrderItem> items;

    @DBRef
    private User user;
    private OrderStatus status;

    public String getId() {
        return id;
    }


    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(final List<OrderItem> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(final OrderStatus status) {
        this.status = status;
    }
}
