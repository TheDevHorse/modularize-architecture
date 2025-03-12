package com.thedevhorse.modularizearchitecture.product.service;

import com.thedevhorse.modularizearchitecture.product.domain.Product;
import com.thedevhorse.modularizearchitecture.product.spi.ProductSpiService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductSpiServiceImpl implements ProductSpiService {

    @Override
    public Product getProductById(String productId) {
        return Product.create(
                BigDecimal.valueOf(2.0)
        );
    }
}
