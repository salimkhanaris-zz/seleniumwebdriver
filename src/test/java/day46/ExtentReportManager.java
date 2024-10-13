package day46;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportManager implements ITestListener
{
    public ExtentSparkReporter sparkReporter; //UI of the report
    public ExtentReports extent; //populate common info on the report
    public ExtentTest test; //creating tc entries in the report and update the status of the test methods

    public void onStart(ITestContext context) {
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/extent/myReport.html"); //specific report
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Functional Testing");
        sparkReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Computer Name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Windows 11");
        extent.setSystemInfo("Browser Name", "Chrome");
    }

    public void onTestSuccess(ITestResult result)
    {
        test= extent.createTest(result.getName()); //Create a new entry in the report
        test.log(Status.PASS,"Test case Passed is: "+result.getName()); //Update the Test Status
    }
    public void onTestFailure(ITestResult result)
    {
        test=extent.createTest(result.getName());
        test.log(Status.FAIL,"Test Case FAILED is: "+result.getName());
        test.log(Status.FAIL,"Test Case FAILED cause is: "+result.getThrowable());
    }
    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName()); //Create a new entry in the report
        test.log(Status.SKIP, "Test case SKIPPED is: " + result.getName()); //Update the Test Status
    }
    public void onFinish(ITestContext context)
    {
        extent.flush(); //Write all info from standard repo to their output view
    }
}
