package com.thedevhorse.modularizearchitecture.order.service;

import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import com.thedevhorse.modularizearchitecture.order.spi.OrderService;
import com.thedevhorse.modularizearchitecture.product.spi.ProductService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderFacade orderFacade;

    public OrderServiceImpl(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }
}
