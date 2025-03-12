package com.thedevhorse.modularizearchitecture.product.domain;

import java.math.BigDecimal;

public class Product {

    private final BigDecimal price;

    private Product(BigDecimal price){
        this.price = price;
    }

    public static Product create(BigDecimal price) {
        return new Product(price);
    }

    public BigDecimal price() {
        return price;
    }
}
