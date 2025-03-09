package com.thedevhorse.modularizearchitecture.order.spi;

import com.thedevhorse.modularizearchitecture.order.domain.Order;

public interface OrderSpiFacade {

    Order getProductById(String productId);
}
