package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class StrategyDashboard extends BaseTest {

	@Test

	public void strategyDashboardTable() throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Strategy Dashboard");

		System.out.println("Test Case 4 #  User is on Strategy dashboard Page ");

		driver.findElement(By.xpath(or.getProperty("strategyname_xpath"))).click();
		System.out.println("Clicked on strategy test name");
		test.log(LogStatus.PASS, "Strategy Name Test Case Pass");
		log.debug("Clicked on strategy test name");

		driver.findElement(By.xpath(or.getProperty("newBacktest_xpath"))).click();
		System.out.println("Clicked on new backtest");
		test.log(LogStatus.PASS, "New Back Test Case Pass");
		log.debug("Clicked on new backtest");

		// ****************************************************

		driver.findElement(By.xpath(or.getProperty("StartDate"))).click();
		driver.findElement(By.xpath(or.getProperty("StartYear"))).click();
		driver.findElement(By.xpath(or.getProperty("StartDec"))).click();
		driver.findElement(By.xpath(or.getProperty("StartSelectMonth"))).click();
		driver.findElement(By.xpath(or.getProperty("StartSelectDate"))).click();
		test.log(LogStatus.PASS, "Start Date Test Case Pass");
		// *****************************************************************************************

		driver.findElement(By.xpath(or.getProperty("EndDate"))).click();
		driver.findElement(By.xpath(or.getProperty("EndYear"))).click();
		driver.findElement(By.xpath(or.getProperty("EndSelectYear"))).click();
		driver.findElement(By.xpath(or.getProperty("EndSelectMonth"))).click();
		test.log(LogStatus.PASS, "End Date Test Case Pass");

		// ****************************************************

		WebElement bundle = driver.findElement(By.xpath(or.getProperty("selectbundle_xpath")));
		System.out.println("Clicked on the drop down option");
		test.log(LogStatus.PASS, "Drop Down Test Case Pass");
		log.debug("Clicked on the drop down option");

		Thread.sleep(3000);
		Select bd = new Select(bundle);
		Thread.sleep(2000);
		bd.selectByVisibleText("NSE");
		System.out.println("Bundle is selected from drop down");
		log.debug("Bundle is selected from drop down");
		test.log(LogStatus.PASS, "Bundle Option Selection Test Case Pass");

		driver.findElement(By.xpath(or.getProperty("runbtn_xpath"))).click();
		System.out.println("Clicked on Run button");
		test.log(LogStatus.PASS, "Run Button Test Case Pass");
		log.debug("Clicked on Run button");
		System.out.println("**************************************************");
	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
