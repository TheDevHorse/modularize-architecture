@org.springframework.modulith.ApplicationModule(
        allowedDependencies = {"product :: spi", "order :: *"}
)
package com.thedevhorse.modularizearchitecture.order.service;