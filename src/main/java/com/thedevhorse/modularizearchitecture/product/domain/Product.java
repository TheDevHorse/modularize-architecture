package com.thedevhorse.modularizearchitecture.product.domain;

import java.math.BigDecimal;

public class Product {

    private final String id;

    private final BigDecimal price;

    private Product(String id,
                    BigDecimal price) {
        this.id = id;
        this.price = price;
    }

    public static Product create(String id,
                                 BigDecimal price) {
        return new Product(
                id,
                price
        );
    }

    public String id() {
        return id;
    }

    public BigDecimal price() {
        return price;
    }
}
