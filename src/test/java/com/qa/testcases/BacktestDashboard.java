package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class BacktestDashboard extends BaseTest {

	@Test

	public void backtestsDashboard() throws Exception {
		rep = ExtentManager.getInstance();
		test = rep.startTest("Backtest Dashboard");

		System.out.println("Test Case 5 # User is on BackTest Dashboard Page  ");
		System.out.println();

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("backtest_xpath"))).click();
		log.debug("Clicked on BackTest link");
		test.log(LogStatus.PASS, "Back Test Link Test Case Pass");
		System.out.println("Clicked on BackTest link");

		Thread.sleep(20000);
		List<WebElement> li = driver.findElements(By.xpath(or.getProperty("row1_xpath")));
		List<WebElement> l = driver.findElements(By.xpath(or.getProperty("row2_xpath")));
		// System.out.println(li.size());
		System.out.println("BackTest Dashboard Status");
		System.out.println();

		for (int i = 1; i < li.size(); i++) {
			for (int j = 1; j < l.size(); j++) {

				System.out.println(li.get(i).getText() + "----" + l.get(i).getText());

				break;

			}
		}

		driver.findElement(By.xpath(or.getProperty("compltedbtn_xpath"))).click();
		log.debug("Clicked on complete button");
		test.log(LogStatus.PASS, "Complete Button Test Case Pass");
		test.log(LogStatus.PASS, "Complete Button Test Case Pass");
		System.out.println("Clicked on complete button");
		System.out.println("**************************************************");

	}  

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
