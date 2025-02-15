package com.thedevhorse.modularizearchitecture.order.internal;

import com.thedevhorse.modularizearchitecture.product.spi.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    private final ProductService productService;


    public OrderController(ProductService productService) {
        this.productService = productService;
    }
}
