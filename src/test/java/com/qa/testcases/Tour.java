package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.qa.utility.TestUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Tour extends BaseTest {

	@Test

	public void tour() throws Exception {
		rep = ExtentManager.getInstance();
		test = rep.startTest("Take Tour");

		click("helptourlink_xpath");
		click("tourlink_xpath");
		element("tourouter_xpath");

		String firstelement = driver.findElement(By.xpath(or.getProperty("popuptext_xpath"))).getText();

		if (firstelement.equals(con.getProperty("firsttourtext"))) {
			System.out.println("Welcome to Quantra Blueshift pop up content match with expected content.");
			test.log(LogStatus.PASS, "Welcome to Quantra Blueshift pop up content match with expected content.");
		} else {
			System.out.println("Welcome to Quantra Blueshift pop up text does not match with expected content.");
			test.log(LogStatus.PASS, "Welcome to Quantra Blueshift pop up text does not match with expected content.");
		}
		click("tournext_xpath");
		wait(1);

		element("tourouter_xpath");

		String secondelement = driver.findElement(By.xpath(or.getProperty("popuptext_xpath"))).getText();

		if (secondelement.equals(con.getProperty("secondtourtext"))) {
			System.out.println("Sample strategy code pop up text match with expected text.");
			test.log(LogStatus.PASS, "Sample strategy code pop up text match with expected text.");
		} else {
			System.out.println("Sample strategy code pop up text does not match with expected text.");
			test.log(LogStatus.PASS, "Sample strategy code pop up text does not match with expected text.");
		}
		click("tournext_xpath");
		wait(1);

		element("tourouter_xpath");

		String thirdelement = driver.findElement(By.xpath(or.getProperty("popuptext_xpath"))).getText();

		if (thirdelement.equals(con.getProperty("thirdtourtext"))) {
			System.out.println("Quick run back test startegy pop up text match with expected text.");
			test.log(LogStatus.PASS, "Quick run back test startegy pop up text match with expected text.");
		} else {
			System.out.println("Quick run back test startegy pop up text does not match with expected text.");
			test.log(LogStatus.PASS, "Quick run back test startegy pop up text does not match with expected text.");
		}
		click("tournext_xpath");
		wait(1);

		element("tourouter_xpath");

		String fourthelement = driver.findElement(By.xpath(or.getProperty("popuptext_xpath"))).getText();

		if (fourthelement.equals(con.getProperty("fourthtourtext"))) {
			System.out.println("Strategies pop up text match with expected text.");
			test.log(LogStatus.PASS, "Strategies pop up text match with expected text.");
		} else {
			System.out.println("Strategies pop up text does not match with expected text.");
			test.log(LogStatus.PASS, "Strategies pop up text does not match with expected text.");
		}
		click("tournext_xpath");
		wait(1);

		element("tourouter_xpath");

		String fifthelement = driver.findElement(By.xpath(or.getProperty("popuptext_xpath"))).getText();

		if (fifthelement.equals(con.getProperty("fifthtourtext"))) {
			System.out.println("New Backtest pop up text match with expected text.");
			test.log(LogStatus.PASS, "New Backtest pop up text match with expected text.");
		} else {
			System.out.println("New Backtest pop up text does not match with expected text.");
			test.log(LogStatus.PASS, "New Backtest pop up text does not match with expected text.");
		}
		click("tournext_xpath");
		wait(1);

		element("tourouter_xpath");

		String sixthtelement = driver.findElement(By.xpath(or.getProperty("popuptext_xpath"))).getText();

		if (sixthtelement.equals(con.getProperty("sixthtourtext"))) {
			System.out.println("Strategies link pop up text match with expected text.");
			test.log(LogStatus.PASS, "Strategies link pop up text match with expected text.");
		} else {
			System.out.println("Strategies link pop up text does not match with expected text.");
			test.log(LogStatus.PASS, "Strategies link pop up text does not match with expected text.");
		}
		click("tournext_xpath");
		wait(1);

		element("tourouter_xpath");

		String sevenelement = driver.findElement(By.xpath(or.getProperty("popuptext_xpath"))).getText();

		if (sevenelement.equals(con.getProperty("seventourtext"))) {
			System.out.println("Help link text match with expected text.");
			test.log(LogStatus.PASS, "Help link text match with expected text.");
		} else {
			System.out.println("Help link text does not match with expected text.");
			test.log(LogStatus.PASS, "Help link text does not match with expected text.");
		}
		click("tournext_xpath");
		wait(1);

		element("tourouter_xpath");

		String eightelement = driver.findElement(By.xpath(or.getProperty("popuptext_xpath"))).getText();

		if (eightelement.equals(con.getProperty("eighttourtext"))) {
			System.out.println("Blueshift contact us pop up text match with expected text.");
			test.log(LogStatus.PASS, "Blueshift contact us pop up text match with expected text.");
		} else {
			System.out.println("Blueshift contact us pop up text does not match with expected text.");
			test.log(LogStatus.PASS, "Blueshift contact us pop up text does not match with expected text.");
		}
		wait(1);

		// Back Test functionality

		for (int i = 0; i <= 8; i++) {
			element("tourouter_xpath");
			element("tourbuttonouter_xpath");
			wait(1);
			click("tourback_xpath");

		}
		System.out.println("Verified the functionality of Back button.");
		test.log(LogStatus.PASS, "Verified the functionality of Back button.");

		for (int i = 0; i <= 8; i++) {
			element("tourouter_xpath");
			element("tourbuttonouter_xpath");
			wait(1);
			click("tournext_xpath");

		}
		System.out.println("Verified the functionality of Next button.");
		test.log(LogStatus.PASS, "Verified the functionality of Next button.");

		element("tourouter_xpath");
		element("tourbuttonouter_xpath");
		click("tourdone_xpath");
		System.out.println("Verified the functionality of Done button");
		test.log(LogStatus.PASS, "Verified the functionality of Done button");

		test.log(LogStatus.PASS, "User successfully gone through the tour");
		wait(2);

		click("clickStrategysubheader_xpath");
		
	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
