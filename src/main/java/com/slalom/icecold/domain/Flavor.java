package com.slalom.icecold.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
public class Flavor {

    @Id
    private String id;

    private String flavorName;

    private BigDecimal price;

    public String getId() {
        return id;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setFlavorName(final String flavorName) {
        this.flavorName = flavorName;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Flavor[id=%s, name='%s', price='%s']", id, flavorName, price);
    }

}
