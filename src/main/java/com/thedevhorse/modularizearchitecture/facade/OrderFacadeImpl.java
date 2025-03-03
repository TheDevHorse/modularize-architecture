package com.thedevhorse.modularizearchitecture.facade;

import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import com.thedevhorse.modularizearchitecture.product.domain.Product;
import com.thedevhorse.modularizearchitecture.product.spi.ProductService;
import org.springframework.stereotype.Component;

@Component
public class OrderFacadeImpl implements OrderFacade {

    private final ProductService productService;

    public OrderFacadeImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void getProductById() {
        Product product = productService.getProductById();
    }
}
