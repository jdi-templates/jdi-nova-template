package com.jdiai.tests;

import com.jdiai.TestInit;
import com.jdiai.asserts.Conditions;
import com.jdiai.test.data.TestData;
import com.jdiai.testng.TestNGListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.jdiai.JDI.$;
import static com.jdiai.JDI.loginAs;
import static com.jdiai.MySite.homePage;
import static com.jdiai.states.States.loginFormOpened;

@Listeners(TestNGListener.class)
public class SmokeTest implements TestInit {

    @BeforeMethod
    public void before() {
        // TODO: REMOVE Place test suite preconditions here (State.java)
        loginFormOpened();
    }

    @Test
    public void simpleTest() {
        // TODO: REMOVE Test Scenario
        loginAs(TestData.Admin);
        homePage.userName.shouldBe(Conditions.visible);
    }

}
