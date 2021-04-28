package org.jdiai.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {
    private int retriesDone = 0;
    private final int retryLimit = 0;

    public boolean retry(ITestResult result) {
        if (retriesDone >= retryLimit)
            return false;
        System.out.println("Retrying " + result.getName() + " again and the count is " + (retriesDone + 1));
        retriesDone++;
        return true;
    }

}
