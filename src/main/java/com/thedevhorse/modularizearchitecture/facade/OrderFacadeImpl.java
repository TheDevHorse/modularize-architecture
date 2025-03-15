package com.thedevhorse.modularizearchitecture.facade;

import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import com.thedevhorse.modularizearchitecture.product.spi.ProductService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderFacadeImpl implements OrderFacade {

    private final ProductService productSpiService;

    public OrderFacadeImpl(ProductService productSpiService) {
        this.productSpiService = productSpiService;
    }

    @Override
    public BigDecimal getPriceByProductId(String productId) {
        return productSpiService.getProductById(productId)
                .price();
    }
}
