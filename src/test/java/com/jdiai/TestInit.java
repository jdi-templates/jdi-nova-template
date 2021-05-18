package com.jdiai;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.jdiai.JDI.openSite;
import static com.jdiai.LoggerTypes.SLF4J;
import static com.jdiai.jswraper.DriverManager.killDrivers;

public interface TestInit {

    @BeforeSuite(alwaysRun = true)
    default void setUp() {
        killDrivers();
        JDI.LOGGER_TYPE = SLF4J;
        openSite(JDISite.class);
    }

    @AfterSuite(alwaysRun = true)
    default void tearDown() {
        killDrivers();
    }
}
