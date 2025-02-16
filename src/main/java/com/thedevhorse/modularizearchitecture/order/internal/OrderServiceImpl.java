package com.thedevhorse.modularizearchitecture.order.internal;

import com.thedevhorse.modularizearchitecture.product.spi.ProductService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final ProductService productService;

    public OrderServiceImpl(ProductService productService) {
        this.productService = productService;
    }
}
