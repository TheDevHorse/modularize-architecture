package com.thedevhorse.modularizearchitecture.product.spi;


import com.thedevhorse.modularizearchitecture.product.domain.Product;

public interface ProductService {

    Product getProductById(String product);
}


