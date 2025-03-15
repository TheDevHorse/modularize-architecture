package com.thedevhorse.modularizearchitecture.payment.spi;

import com.thedevhorse.modularizearchitecture.payment.domain.Payment;

public interface PaymentService {

    void executePayment(Payment payment);
}
