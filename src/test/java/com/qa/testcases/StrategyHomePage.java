package com.qa.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class StrategyHomePage extends BaseTest {
	@Test

	public void strategyHomePage() throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("DashBoard Page");

		String strategytitle = driver.findElement(By.xpath(or.getProperty("Strategies_xpath"))).getText();
		String strategytext = driver.findElement(By.xpath(or.getProperty("Strategiescontent_xpath"))).getText();

		if (strategytitle.equals(con.getProperty("Strategiespagetitle"))) {
			System.out.println("Verified Strategy page title match with expected title.");
			test.log(LogStatus.PASS, "Verified Strategy page title match with expected title.");

		} else {
			System.out.println("Verified Strategy page title does not match with expected title.");
			test.log(LogStatus.PASS, "Verified Strategy page title does not match with expected title.");

		}

		if (strategytext.equals(con.getProperty("Strategypagetext")))

		{
			System.out.println("Verified Strategy page content match with expected content.");
			test.log(LogStatus.PASS, "Verified Strategy page content match with expected content.");
		} else {
			System.out.println("Verified Strategy page content does not match with expected content.");
			test.log(LogStatus.PASS, "Verified Strategy page content does not match with expected content.");
		}

		boolean deletebtn = driver.findElement(By.xpath(or.getProperty("dashboardDeleteButton"))).isEnabled();
		System.out.println("Is Delete button in disable condition" + "=" + deletebtn);
		test.log(LogStatus.PASS, "Is Delete button in disable condition" + "=" + deletebtn);

	}

	@AfterTest

	public void tearDown() {

		rep.flush();

	}

}
