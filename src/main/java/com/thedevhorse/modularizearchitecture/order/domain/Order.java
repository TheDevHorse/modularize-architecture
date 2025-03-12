package com.thedevhorse.modularizearchitecture.order.domain;

public class Order {

    private String id;

    private String productId;

    private Order(String id, String productId) {
        this.id = id;
        this.productId = productId;
    }

    private static Order create(String id, String productId){
        return new Order(id, productId);
    }

    public String id() {
        return id;
    }

    public String productId() {
        return productId;
    }
}
