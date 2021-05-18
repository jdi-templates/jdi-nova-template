package com.jdiai.testng;

import com.epam.jdi.tools.Safe;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.epam.jdi.tools.LinqUtils.last;
import static java.lang.String.format;
import static java.lang.System.currentTimeMillis;
import static com.jdiai.JDI.driver;

public class TestNGListener implements IInvokedMethodListener {
    private Safe<Long> start = new Safe<>(0L);
    public static Safe<String> TEST_NAME = new Safe<>((String) null);

    @Override
    public void beforeInvocation(IInvokedMethod m, ITestResult tr) {
        if (!m.isTestMethod())
            return;
        ITestNGMethod testMethod = m.getTestMethod();
        if (!testMethod.getConstructorOrMethod().getMethod().isAnnotationPresent(Test.class))
            return;
        String testName = last(testMethod.getTestClass().getName().split("\\.")) +
            "." + testMethod.getMethodName();
        TEST_NAME.set(testName);
        start.set(currentTimeMillis());
        System.out.printf("== Test '%s' START ==%n", testName);
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult tr) {
        if (!method.isTestMethod())
            return;
        String result = getTestResult(tr);
        System.out.printf("=== Test '%s' %s [%s] ===%n", TEST_NAME.get(), result, timePassed());
        if (!"FAILED".equals(result))
            return;
        if (tr.getThrowable() != null) {
            System.out.println("ERROR: " + tr.getThrowable().getMessage());
            System.out.println("URL: " + driver().getCurrentUrl());
        } else {
            System.out.println("UNKNOWN ERROR");
        }
    }
    private String timePassed() {
        return new SimpleDateFormat("mm:ss.SS")
            .format(new Date(currentTimeMillis() - start.get()));
    }

    private String getTestResult(ITestResult result) {
        switch (result.getStatus()) {
            case ITestResult.SUCCESS:
                return "PASSED";
            case ITestResult.SKIP:
                return "SKIPPED";
            case ITestResult.FAILURE:
            case ITestResult.SUCCESS_PERCENTAGE_FAILURE:
                return "FAILED";
            case ITestResult.STARTED:
                return "STARTED";
            case ITestResult.CREATED:
                return "CREATED";
        }
        return "FAILED";
    }
}
