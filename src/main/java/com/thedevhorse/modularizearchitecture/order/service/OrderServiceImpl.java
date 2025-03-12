package com.thedevhorse.modularizearchitecture.order.service;

import com.thedevhorse.modularizearchitecture.order.domain.Order;
import com.thedevhorse.modularizearchitecture.order.spi.OrderSpiFacade;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderSpiFacade orderSpiFacade;

    public OrderServiceImpl(OrderSpiFacade orderSpiFacade) {
        this.orderSpiFacade = orderSpiFacade;
    }

    @Override
    public void processOrder(Order order) {
        BigDecimal price = orderSpiFacade.getPriceByProductId(order.productId());
    }
}
