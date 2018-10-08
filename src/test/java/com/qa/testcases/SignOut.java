package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class SignOut extends BaseTest {

	@Test

	public void signOut() {
		rep = ExtentManager.getInstance();
		test = rep.startTest("Sign Out");
		
		
		click("profileicon_xpath");
		wait(1);
		element("profileouter_xpath");
		wait(1);
		click("signout_xpath");
		test.log(LogStatus.PASS, "Clicked on the Sign Out link");
		test.log(LogStatus.PASS, "User successfully sign out from the application");

	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}