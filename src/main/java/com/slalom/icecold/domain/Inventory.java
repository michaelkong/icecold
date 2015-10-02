package com.slalom.icecold.domain;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import org.springframework.data.mongodb.core.mapping.DBRef;


public class Inventory {

    @Id
    private String id;

    @DBRef
    private Flavor flavor;

    private BigDecimal quantity;

    public String getId() {
        return id;
    }

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

