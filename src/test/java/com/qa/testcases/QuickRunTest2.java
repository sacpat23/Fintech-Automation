package com.qa.testcases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mysql.cj.core.io.StandardSocketFactory;
import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;
import com.qa.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class QuickRunTest2 extends BaseTest {

	@Test(dataProvider = "ReadFromExcel")

	public void quickRunTest(Hashtable<String, String> data) throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Quick Back Test");
		

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Quick Run
		Thread.sleep(1000);
		try {
			WebElement bundle = driver.findElement(By.xpath(or.getProperty("quickbundle_xpath")));
			System.out.println("Clicked on the drop down option");
			log.debug("Clicked on the drop down option");

			Thread.sleep(2000);
			Select bd = new Select(bundle);
			Thread.sleep(2000);
			bd.selectByVisibleText(data.get("StrategyOption"));
			System.out.println("Bundle is selected from drop down");
			log.debug("Bundle is selected from drop down");
			test.log(LogStatus.PASS, "Bundle is selected from drop down");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		wait(1);
		click("quickStartYearInput_xpath");
		// System.out.println("quickStartYearInput_xpath");
		wait(1);

		click("quickStartYearfirst_xpath");
		// System.out.println("quickStartYearfirst_xpath");
		wait(1);
		click("quickStartYearsecond_xpath");
		// System.out.println("quickStartYearsecond_xpath");

		wait(1);

		click("quickStartYearforward_xpath");
		System.out.println("quickStartYearforward_xpath");
		cm.quickYearSelection(data.get("StartYear"));
		System.out.println("Start Year");

		cm.quickMonthSelection(data.get("StartMonth"));
		System.out.println("Start Month ");

		cm.quickDaySelection(data.get("StartDay"));
		System.out.println("Start Day");
		test.log(LogStatus.PASS, "Start Year is selected");
		System.out.println("Start Year is selected");
		wait(1);

		click("quickendinput_xpath");
		click("quickEndYearfirst_xpath");
		click("quickEndYearsecond_xpath");
		element("quickEndYearOuter_xpath");
		cm.quickYearEndSelection(data.get("EndYear"));
		wait(2);
		System.out.println("End Year selected");
		cm.quickEndMonthSelection(data.get("EndMonth"));
		wait(1);
		System.out.println("End Month is selected");
		cm.quickEndDaySelection(data.get("EndDay"));
		System.out.println("End Date is selected");
		test.log(LogStatus.PASS, "End year is selected");
		wait(1);

		clear("quickcapital_xpath");
		type("quickcapital_xpath", data.get("Capital"));
		test.log(LogStatus.PASS, "Entered the starting capital");
		System.out.println("Entered the starting capital");

		wait(1);
		click("quickrun_xpath");
		test.log(LogStatus.PASS, "Clicked on the run button");
		wait(30);

		String ActualReturns = driver.findElement(By.xpath(
				".//*[@id='app']/div[1]/div/div/div/div/div/div/section/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[1]"))
				.getText();
		if (ActualReturns.equals(con.getProperty("QRETURNS"))) {
			System.out.println("Actual & Expected RETURN match");
			test.log(LogStatus.PASS, "Actual & Expected RETURN match");
		} else {
			System.out.println("Actual & Expected RETURN not match");
			test.log(LogStatus.PASS, "Actual & Expected RETURN not match");
		}
		wait(1);

		String ActualAlpha = driver.findElement(By.xpath(
				".//*[@id='app']/div[1]/div/div/div/div/div/div/section/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[1]"))
				.getText();
		if (ActualAlpha.equals(con.getProperty("QALPHA"))) {
			System.out.println("Actual & Expected ALPHA match");
			test.log(LogStatus.PASS, "Actual & Expected ALPHA match");
		} else {
			System.out.println("Actual & Expected ALPHA not match");
			test.log(LogStatus.PASS, "Actual & Expected ALPHA not match");
		}

		wait(1);

		String ActualBeta = driver.findElement(By.xpath(
				".//*[@id='app']/div[1]/div/div/div/div/div/div/section/div[2]/div/div/div[1]/div/div/div[2]/div/div[3]/div[1]"))
				.getText();
		if (ActualBeta.equals(con.getProperty("QBETA"))) {
			System.out.println("Actual & Expected BETA match");
			test.log(LogStatus.PASS, "Actual & Expected BETA match");
		} else {
			System.out.println("Actual & Expected BETA not match");
			test.log(LogStatus.PASS, "Actual & Expected BETA not match");
		}

		wait(1);

		String ActualSharpe = driver.findElement(By.xpath(
				".//*[@id='app']/div[1]/div/div/div/div/div/div/section/div[2]/div/div/div[1]/div/div/div[2]/div/div[4]/div[1]"))
				.getText();
		if (ActualSharpe.equals(con.getProperty("QSHARPE"))) {
			System.out.println("Actual & Expected SHARPE match");
			test.log(LogStatus.PASS, "Actual & Expected SHARPE match");
		} else {
			System.out.println("Actual & Expected SHARPE not match");
			test.log(LogStatus.PASS, "Actual & Expected SHARPE not match");
		}

		wait(1);

		String ActualDrawdown = driver.findElement(By.xpath(
				".//*[@id='app']/div[1]/div/div/div/div/div/div/section/div[2]/div/div/div[1]/div/div/div[2]/div/div[5]/div[1]"))
				.getText();
		if (ActualDrawdown.equals(con.getProperty("QDRAWDOWN"))) {
			System.out.println("Actual & Expected DRWADOWN match");
			test.log(LogStatus.PASS, "Actual & Expected DRWADOWN match");
		} else {
			System.out.println("Actual & Expected DRWADOWN not match");
			test.log(LogStatus.PASS, "Actual & Expected DRWADOWN not match");
		}

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("jQuery('#code').val()");
		// System.out.println(js.executeScript("return jQuery('#code').val().text();"));

		System.out.println("JQuery");

	}

	@DataProvider(name = "ReadFromExcel")

	public Object[][] getaData() {
		String sheetName = "Sheet15";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];
		Hashtable<String, String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) {

			table = new Hashtable<String, String>();

			for (int colNum = 0; colNum < cols; colNum++) {
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;

			}

		}
		return data;

	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
