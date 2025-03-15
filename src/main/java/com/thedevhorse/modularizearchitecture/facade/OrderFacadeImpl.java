package com.thedevhorse.modularizearchitecture.facade;

import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import com.thedevhorse.modularizearchitecture.payment.domain.Payment;
import com.thedevhorse.modularizearchitecture.payment.spi.PaymentService;
import com.thedevhorse.modularizearchitecture.product.spi.ProductService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderFacadeImpl implements OrderFacade {

    private final ProductService productService;

    private final PaymentService paymentService;

    public OrderFacadeImpl(ProductService productService,
                           PaymentService paymentService) {
        this.productService = productService;
        this.paymentService = paymentService;
    }

    @Override
    public BigDecimal getPriceByProductId(String productId) {
        return productService.getProductById(productId)
                .price();
    }

    @Override
    public void executePayment(BigDecimal price, Long cardNumber) {
        paymentService.executePayment(
                Payment.create(
                        price,
                        cardNumber
                )
        );
    }
}
