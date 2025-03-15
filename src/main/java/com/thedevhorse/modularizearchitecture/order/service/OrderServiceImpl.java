package com.thedevhorse.modularizearchitecture.order.service;

import com.thedevhorse.modularizearchitecture.order.domain.Order;
import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderFacade orderSpiFacade;

    public OrderServiceImpl(OrderFacade orderSpiFacade) {
        this.orderSpiFacade = orderSpiFacade;
    }

    @Override
    public void processOrder(Order order) {
        orderSpiFacade.executePayment(
                orderSpiFacade.getPriceByProductId(order.productId()),
                order.cardNumber()
        );
    }
}
