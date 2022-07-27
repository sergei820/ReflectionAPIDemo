package org.example.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static org.example.ReflectionAPIDemo.checkUITestAnnotation;

public class AnnotationsListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        checkUITestAnnotation(iTestResult.getTestClass().getRealClass());
    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
