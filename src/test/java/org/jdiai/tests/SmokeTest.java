package org.jdiai.tests;

import org.jdiai.JDI;
import org.jdiai.TestInit;
import org.jdiai.testng.TestNGListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class SmokeTest implements TestInit {

    @BeforeMethod
    public void before() {
        // Place test suite preconditions here (State.java)
    }

    @Test
    public void simpleTest() {
        // Test Scenario
    }

}
