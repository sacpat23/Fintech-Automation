package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class TransactionDashboard extends BaseTest {

	@Test

	public void transactionDashBoard() throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Transaction Dashboard");

		System.out.println("Test Case 7 # User is on Transaction Dashboard Page ");
		System.out.println();

		Thread.sleep(2000);

		driver.findElement(By.xpath(or.getProperty("txnname_xpath"))).click();
		test.log(LogStatus.PASS, "Transaction Dashboard Test Case Pass");
		Thread.sleep(2000);

		System.out.println("Page Title is " + driver.findElement(By.xpath(or.getProperty("txnname_xpath"))).getText());
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Page Title Verification Test Case Pass");
		System.out.println();

		List<WebElement> tabledata = driver.findElements(By.tagName("tr"));

		for (int i = 0; i < tabledata.size(); i++) {
			String t = tabledata.get(i).getText();
			System.out.println("#  " + t + "!!!");
		}
		System.out.println("**************************************************");

	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}
}