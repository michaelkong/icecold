package com.slalom.icecold.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigDecimal;


public class OrderItem {

    @Id
    private String id;

    @DBRef
    private Flavor flavor;

    private BigDecimal quantity;


    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(final Flavor flavor) {
        this.flavor = flavor;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(final BigDecimal quantity) {
        this.quantity = quantity;
    }


}
