package com.thedevhorse.modularizearchitecture.order.spi;

import java.math.BigDecimal;

public interface OrderSpiFacade {

    BigDecimal getPriceByProductId(String productId);
}
