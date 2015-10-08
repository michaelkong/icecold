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
    private UserAccount userAccount;
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

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(final UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(final OrderStatus status) {
        this.status = status;
    }
}
