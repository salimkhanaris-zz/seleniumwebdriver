package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;



public class MyListener implements ITestListener
{

    public void onStart(ITestContext context)
    {
        System.out.println("OnStart Method");
    }

    public void onTestStart(ITestResult result)
    {
        System.out.println("When test starts");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("When Test passes ");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("On Test fail Method");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("On Test Skip Method");
    }

    public void onFinish(ITestContext context) {
        System.out.println("After all Test execution is completed");
    }
}
