package com.thedevhorse.modularizearchitecture.order.service;

import com.thedevhorse.modularizearchitecture.order.domain.Order;
import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderFacade orderSpiFacade;

    public OrderServiceImpl(OrderFacade orderSpiFacade) {
        this.orderSpiFacade = orderSpiFacade;
    }

    @Override
    public void processOrder(Order order) {
        BigDecimal price = orderSpiFacade.getPriceByProductId(order.productId());
    }
}
