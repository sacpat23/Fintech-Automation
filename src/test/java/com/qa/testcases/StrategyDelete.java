package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class StrategyDelete extends BaseTest {

	@Test

	public void StrategyDelete() throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Strategy Delete");

		element("backtesttableout_xpath");
		wait(1);
		click("firstcheckbox_xpath");
		wait(1);
		cm.removeStrategy();
		wait(1);
		click("maincheckbox_xpath");
		wait(1);
		cm.removeStrategy();
		wait(1);
		cm.nostrategyPresentOnPageValidation();

	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
