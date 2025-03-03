package com.thedevhorse.modularizearchitecture.product.service;

import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import com.thedevhorse.modularizearchitecture.product.domain.Product;
import com.thedevhorse.modularizearchitecture.product.spi.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {



    @Override
    public Product getProductById() {
        return null;
    }
}
