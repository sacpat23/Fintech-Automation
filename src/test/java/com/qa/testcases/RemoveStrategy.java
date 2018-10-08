package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class RemoveStrategy extends BaseTest {

	@Test

	public void removeStrategy() throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Remove Strategy");

		System.out.println("Test Case 8 # User is on Delete Strategy Page ");

		driver.findElement(By.xpath(or.getProperty("backtestlink_xpath"))).click();
		log.debug("Clicked on BactTest link");
		test.log(LogStatus.PASS, "Back Test Link Test Case Pass");
		System.out.println("Clicked on BactTest link");

		driver.findElement(By.xpath(or.getProperty("checkbox_xpath"))).click();
		log.debug("Clicked on checkbox");
		test.log(LogStatus.PASS, "Check box Test Case Pass");
		System.out.println("Clicked on checkbox");

		driver.findElement(By.xpath(or.getProperty("deletebtn_xpath"))).click();
		log.debug("Clicked on delete button");
		test.log(LogStatus.PASS, "Delete Button Test Case Pass");
		System.out.println("Clicked on delete button");

		WebElement e = driver.findElement(By.xpath(or.getProperty("modal_xpath")));

		log.debug("Opened modal popup window");
		test.log(LogStatus.PASS, "Pop Up Modal Test Case Pass");
		System.out.println("Opned modal popup window");

		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath(or.getProperty("delete_xpath")));

		log.debug("Modal open");
		test.log(LogStatus.PASS, "Open Modal Window Test Case Pass");
		System.out.println("Open Modal Window Test Case Pass");

		Thread.sleep(2000);
		e1.click();
		log.debug("Clicked on delete button");
		test.log(LogStatus.PASS, "Delete Button Test Case Pass");
		System.out.println("Clicked on delete button");

		System.out.println("**************************************************");
	}

	@AfterTest
	public void endReport() {
		rep.flush();
		driver.close();

	}
}
