package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class StrategyPage extends BaseTest {

	@Test

	public void strategy() throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Strategy Page");

		System.out.println("Test Case 3 # User is on Strategy Page " + "");

		Thread.sleep(3000);
		driver.findElement(By.xpath(or.getProperty("description_xpath"))).sendKeys(con.getProperty("description"));
		log.debug("enter description");
		test.log(LogStatus.PASS, "Description Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("style_xpath"))).click();
		log.debug("click on drop down list");
		test.log(LogStatus.PASS, "Style Drop Down Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("styleselect0_xpath"))).click();
		log.debug("select risk-factor");
		test.log(LogStatus.PASS, "Option Selection Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("style_xpath"))).click();
		log.debug("click on drop down list");
		test.log(LogStatus.PASS, "Drop Down Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("styleselect1_xpath"))).click();
		log.debug("select pair trading");
		test.log(LogStatus.PASS, "Option Selection Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("selectAsset_xpath"))).click();
		log.debug("Click on Asset");
		test.log(LogStatus.PASS, "Asset Drop Down Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("asset0_xpath"))).click();
		log.debug("select asset");
		test.log(LogStatus.PASS, "Option Selection Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("selectAsset_xpath"))).click();
		log.debug("Click on Asset");
		test.log(LogStatus.PASS, "Drop Down Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("asset1_xpath"))).click();
		log.debug("select asset");
		test.log(LogStatus.PASS, "Option Selection Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("saveStrategy_xpath"))).click();
		log.debug("click on save button asset");
		test.log(LogStatus.PASS, "Save Button Test Case Pass");

		Thread.sleep(2000);
		driver.findElement(By.xpath(or.getProperty("clickStrategysubheader_xpath"))).click();
		log.debug("click on the strategy sub header");
		test.log(LogStatus.PASS, "Sub Header Test Case Pass");

		Thread.sleep(2000);
		System.out.println(
				"Strategy Test Name is " + driver.findElement(By.xpath(or.getProperty("verifyname_xpath"))).getText());
		test.log(LogStatus.PASS, "Strategy Name Test Case Pass");
		log.debug(driver.findElement(By.xpath(or.getProperty("verifyname_xpath"))).getText());

		System.out.println("**************************************************");
	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
