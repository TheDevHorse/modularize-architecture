package com.thedevhorse.modularizearchitecture.facade;

import com.thedevhorse.modularizearchitecture.order.domain.Order;
import com.thedevhorse.modularizearchitecture.order.spi.OrderSpiFacade;
import com.thedevhorse.modularizearchitecture.product.domain.Product;
import com.thedevhorse.modularizearchitecture.product.spi.ProductSpiService;
import org.springframework.stereotype.Component;

@Component
public class OrderFacadeImpl implements OrderSpiFacade {

    private final ProductSpiService productSpiService;

    public OrderFacadeImpl(ProductSpiService productSpiService) {
        this.productSpiService = productSpiService;
    }

    @Override
    public Order getProductById(String productId) {
        Product product = productSpiService.getProductById(productId);
        return null;
    }
}
