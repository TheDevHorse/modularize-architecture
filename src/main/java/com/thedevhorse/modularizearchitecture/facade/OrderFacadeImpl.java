package com.thedevhorse.modularizearchitecture.facade;

import com.thedevhorse.modularizearchitecture.order.spi.OrderSpiFacade;
import com.thedevhorse.modularizearchitecture.product.spi.ProductSpiService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderFacadeImpl implements OrderSpiFacade {

    private final ProductSpiService productSpiService;

    public OrderFacadeImpl(ProductSpiService productSpiService) {
        this.productSpiService = productSpiService;
    }

    @Override
    public BigDecimal getPriceByProductId(String productId) {
        return productSpiService.getProductById(productId)
                .price();
    }
}
