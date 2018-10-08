package com.qa.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.qa.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Listeners extends BaseTest implements ITestListener {

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
		try {
			ScreenShotManager.captureScreenshot();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void onTestFailure(ITestResult result) {

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			ScreenShotManager.captureScreenshot();

		} catch (IOException e) {

			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, result.getName().toUpperCase() + " Failed with exception : " + result.getThrowable());
		// test.log(LogStatus.FAIL, test.addScreenCapture(TestUtils.screenshotName));

		rep.endTest(test);
		rep.flush();

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	
}
