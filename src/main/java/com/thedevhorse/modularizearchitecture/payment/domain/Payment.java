package com.thedevhorse.modularizearchitecture.payment.domain;

import java.math.BigDecimal;

public class Payment {

    private final BigDecimal price;
    private final Long cardNumber;

    private Payment(BigDecimal price,
                    Long cardNumber) {
        this.price = price;
        this.cardNumber = cardNumber;
    }

    public static Payment create(BigDecimal price,
                                 Long cardNumber) {
        return new Payment(
                price,
                cardNumber
        );
    }

    public BigDecimal price() {
        return price;
    }

    public Long cardNumber() {
        return cardNumber;
    }
}
