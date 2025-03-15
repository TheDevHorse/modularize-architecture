package com.thedevhorse.modularizearchitecture.payment.service;

import com.thedevhorse.modularizearchitecture.payment.domain.Payment;
import com.thedevhorse.modularizearchitecture.payment.spi.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private static final Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);

    @Override
    public void executePayment(Payment payment) {
        logger.info("Payment of {} processed successfully for card ending with: {}",
                payment.price(),
                payment.cardNumber()
        );
    }
}
