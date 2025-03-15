package com.thedevhorse.modularizearchitecture.order.domain;

public class Order {

    private final String id;

    private final String productId;

    private final Long cardNumber;

    private Order(String id,
                  String productId,
                  Long cardNumber) {
        this.id = id;
        this.productId = productId;
        this.cardNumber = cardNumber;
    }

    public static Order create(String id,
                               String productId,
                               Long cardNumber){
        return new Order(
                id,
                productId,
                cardNumber
        );
    }

    public String id() {
        return id;
    }

    public String productId() {
        return productId;
    }

    public Long cardNumber() {
        return cardNumber;
    }
}
