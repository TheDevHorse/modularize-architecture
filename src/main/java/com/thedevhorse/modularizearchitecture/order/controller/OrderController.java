package com.thedevhorse.modularizearchitecture.order.controller;

import com.thedevhorse.modularizearchitecture.order.spi.OrderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
}
