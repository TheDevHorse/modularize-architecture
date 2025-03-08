package com.thedevhorse.modularizearchitecture.order.service;

import com.thedevhorse.modularizearchitecture.order.spi.OrderSpiFacade;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderSpiFacade orderSpiFacade;

    public OrderServiceImpl(OrderSpiFacade orderSpiFacade) {
        this.orderSpiFacade = orderSpiFacade;
    }
}
