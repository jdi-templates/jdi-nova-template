package com.jdiai.tests;

import com.jdiai.TestInit;
import com.jdiai.JDI;
import com.jdiai.testng.TestNGListener;
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
