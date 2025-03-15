package com.thedevhorse.modularizearchitecture.payment.service;

import com.thedevhorse.modularizearchitecture.payment.domain.Payment;
import com.thedevhorse.modularizearchitecture.payment.spi.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void executePayment(Payment payment) {

    }
}
