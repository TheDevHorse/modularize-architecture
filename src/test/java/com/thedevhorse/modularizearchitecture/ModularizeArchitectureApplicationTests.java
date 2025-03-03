package com.thedevhorse.modularizearchitecture;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class ModularizeArchitectureApplicationTests {


    @Test
    void createApplicationModuleModel() {
        ApplicationModules modules = ApplicationModules.of(ModularizeArchitectureApplication.class);
        modules.verify();
    }
}
