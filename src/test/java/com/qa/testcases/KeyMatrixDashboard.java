package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class KeyMatrixDashboard extends BaseTest {

	@Test

	public void keyMatrixDashboard() throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Key Matrix Dashboard");

		System.out.println("Test Case 6 # User is on Key Matrix Dashboard Page");
		System.out.println();

		Thread.sleep(1000);

		System.out.println("You are on " + driver.findElement(By.xpath(or.getProperty("kmtitle_xpath"))).getText() + "-"
				+ " Dashboard");
		log.debug("You are on " + driver.findElement(By.xpath(or.getProperty("kmtitle_xpath"))).getText() + "-"
				+ " Dashboard");
		test.log(LogStatus.PASS, "Page Title Test Case Pass");
		System.out.println();

		System.out.println("Verify " + driver.findElement(By.xpath(or.getProperty("pmttitle_xpath"))).getText());
		log.debug("Verify " + driver.findElement(By.xpath(or.getProperty("pmttitle_xpath"))).getText());
		test.log(LogStatus.PASS, "Performance Metrics Title Test Case Pass");
		System.out.println();

		/*
		 * List<WebElement> q =
		 * driver.findElements(By.xpath("//div[@class='col-md-3']/div"));
		 * System.out.println(q.size()); log.debug(q.size());
		 * 
		 * for (int i=0; i<q.size();i++) { System.out.println(q.get(i).getText());
		 * log.debug(q.get(i).getText());
		 * 
		 * 
		 * }
		 */
		// .//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[2]/div[2]/div

		List<WebElement> t1 = driver.findElements(By.xpath("//div[@class='col-md-3']/div"));

		for (int i = 0; i < t1.size(); i++) {
			String p = t1.get(i).getText();
			System.out.println(p);

		}
		System.out.println("**************************************************");
	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
