package com.thedevhorse.modularizearchitecture.order.service;

import com.thedevhorse.modularizearchitecture.order.domain.Order;

public interface OrderService {

    String processOrder(Order order);
}
