package com.thedevhorse.modularizearchitecture.payment.domain;

import java.math.BigDecimal;

public class Payment {

    private BigDecimal price;
    private String cardNumber;

    private Payment(BigDecimal price,
                    String cardNumber) {
        this.price = price;
        this.cardNumber = cardNumber;
    }

    public static Payment create(BigDecimal price,
                          String cardNumber) {
        return new Payment(
                price,
                cardNumber
        );
    }

    public BigDecimal price() {
        return price;
    }

    public String cardNumber() {
        return cardNumber;
    }
}
