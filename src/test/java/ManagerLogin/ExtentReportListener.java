package ManagerLogin;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportListener implements ITestListener { //ITestListener is used to listen the test execution and generate the report
	ExtentTest test;//Extent test use to create the test in the report
	
	public void onTestStart(ITestResult result) {
		try {
			test = ExtentReportManager.getInstance().createTest(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//onstart method is used to create the test in the report
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, " TestPassed");//ontestsuccess method is used to log the test case passed in the report
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getThrowable());//ontestfailure method is used to log the test case failed in the report)
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Skipped");// ontestskipped method is used to log the test case skipped in the report
	}
	
	public void onFinish(org.testng.ITestContext context){
		
		try {
			ExtentReportManager.getInstance().flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//onfinish method is used to flush the report after the test execution is completed
	}
	

}
