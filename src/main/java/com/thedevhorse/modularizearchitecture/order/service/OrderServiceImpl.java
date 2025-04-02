package com.thedevhorse.modularizearchitecture.order.service;

import com.thedevhorse.modularizearchitecture.order.domain.Order;
import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderFacade orderFacade;

    public OrderServiceImpl(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    @Override
    public String processOrder(Order order) {
        orderFacade.executePayment(
                orderFacade.getPriceByProductId(order.productId()),
                order.cardNumber()
        );
        return format("Order completed successfully for order id : %s", order.id());
    }
}
