package com.thedevhorse.modularizearchitecture;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
class ModularizeArchitectureApplicationTests {
    @Test
    void createApplicationModuleModel() {
        ApplicationModules modules = ApplicationModules.of(ModularizeArchitectureApplication.class);
        modules.verify();
        new Documenter(modules)
                .writeDocumentation()
                .writeIndividualModulesAsPlantUml();
    }

}
