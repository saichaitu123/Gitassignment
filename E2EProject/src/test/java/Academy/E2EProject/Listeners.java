package Academy.E2EProject;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.ExtentReportNG;

public class Listeners extends Resources.base implements ITestListener {
	static ExtentTest test; 	
 ExtentReports extent =	ExtentReportNG.getReportObject();
public void onTestStart(ITestResult result) {
	test= extent.createTest(result.getMethod().getMethodName());	
}


public void onTestSuccess(ITestResult result) {
	test.log(Status.PASS, "TEST Passed");
}


public void onTestFailure(ITestResult result) {
	test.fail(result.getThrowable());
}

public void onFinish(ITestContext context) {
	extent.flush();
	
}
}

 