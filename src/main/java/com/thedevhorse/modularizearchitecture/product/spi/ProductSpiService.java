package com.thedevhorse.modularizearchitecture.product.spi;


import com.thedevhorse.modularizearchitecture.product.domain.Product;

public interface ProductSpiService {

    Product getProductById(String product);
}


