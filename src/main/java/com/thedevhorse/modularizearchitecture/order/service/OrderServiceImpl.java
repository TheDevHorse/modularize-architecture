package com.thedevhorse.modularizearchitecture.order.service;

import com.thedevhorse.modularizearchitecture.order.domain.Order;
import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderFacade orderSpiFacade;

    public OrderServiceImpl(OrderFacade orderSpiFacade) {
        this.orderSpiFacade = orderSpiFacade;
    }

    @Override
    public String processOrder(Order order) {
        orderSpiFacade.executePayment(
                orderSpiFacade.getPriceByProductId(order.productId()),
                order.cardNumber()
        );
        return format("Order completed successfully for order id : %s", order.id());
    }
}
