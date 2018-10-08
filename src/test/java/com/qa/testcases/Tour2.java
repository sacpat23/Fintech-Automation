package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.qa.utility.TestUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Tour2 extends BaseTest {

	@Test

	public void tour() throws Exception {
		rep = ExtentManager.getInstance();
		test = rep.startTest("Take Tour");
		
		
		click("helptourlink_xpath");

		click("tourlink_xpath");

		for (int i = 0; i <= 7; i++) {

			element("tourouter_xpath");
			element("tourbuttonouter_xpath");
			click("tournext_xpath");
			wait(1);

		}

		element("tourouter_xpath");
		element("tourbuttonouter_xpath");
		click("tourdone_xpath");
		
		test.log(LogStatus.PASS, "User successfully gone through the tour");

	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
