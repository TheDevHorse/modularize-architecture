package com.thedevhorse.modularizearchitecture.order.spi;

import java.math.BigDecimal;

public interface OrderFacade {

    BigDecimal getPriceByProductId(String productId);
}
