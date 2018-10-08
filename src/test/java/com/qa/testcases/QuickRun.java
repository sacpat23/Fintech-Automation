package com.qa.testcases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.*;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.win32.Netapi32Util.User;

public class QuickRun extends BaseTest {

	@Test(dataProvider = "ReadFromExcelSheet")

	public void quickRun(Hashtable<String, String> data) throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Quick Run");

		// Create Strategy

		click("createnewstrategy_xpath");
		log.debug("Clicked on the Create New Stretegy button");
		test.log(LogStatus.PASS, "Clicked on the Create New Stretegy button");
		System.out.println("Clicked on the Create New Stretegy button");	

		/////////////////////////////////////////////////////////////////
		click("createalgorithm_xpath");

		String ActualTitleName = driver.findElement(By.xpath(or.getProperty("StrategyNamealtmsg_xpath"))).getText();

		String ExpectedTitleName = con.getProperty("Titile");
		Assert.assertEquals(ActualTitleName, ExpectedTitleName);
		System.out.println("Actual Title and Expected Title matched");
		test.log(LogStatus.PASS, "Actual Title and Expected Title matched");

		String ActualStrategyTemplateName = driver.findElement(By.xpath(or.getProperty("StrategyTemplatealtmsg_xpath")))
				.getText();

		String ExpectedStrategyTemplateName = con.getProperty("Strategytemplate");
		Assert.assertEquals(ActualStrategyTemplateName, ExpectedStrategyTemplateName);
		System.out.println("Actual Strategy Template and Expected Strategy Template matched");
		test.log(LogStatus.PASS, "Actual Strategy Template and Expected Strategy Template matched");

		/////////////////////////////////////////////////////////////////

		wait(1);
		type("stretegytitle_xpath", data.get("StrategyName"));
		log.debug("Entered title name");
		test.log(LogStatus.PASS, "Entered title name");
		System.out.println("Entered title name");

		wait(2);
		WebElement stretegy = driver.findElement(By.xpath(or.getProperty("selectstretegytemplate")));
		log.debug("Clicked on the drop down list");
		test.log(LogStatus.PASS, "Clicked on the drop down list");
		System.out.println("Clicked on the drop down list");

		wait(2);
		Select se = new Select(stretegy);
		se.selectByVisibleText(data.get("StrategyTemplate"));
		log.debug("Stretegy is selected from drop down");
		test.log(LogStatus.PASS, "Stretegy is selected from drop down");
		System.out.println("Stretegy is selected from drop down");

		wait(1);
		click("createalgorithm_xpath");
		log.debug("Clicked on the Create Algorithm button");
		test.log(LogStatus.PASS, "Clicked on the Create Algorithm button");
		System.out.println("Clicked on the Create Algorithm button");

		// Alog edit page

		System.out.println("--------------------------------");
		driver.findElement(By.xpath(or.getProperty("algoeditor_xpath")));

		driver.findElement(By.xpath(or.getProperty("aldocodetexteditor_xpath")));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String script = "return document.getElementById('code').getAttribute('value');";

		jse.executeScript(script);

		System.out.println(jse.executeScript(script));

		PrintStream console = System.out;
		System.out.println(jse.executeScript(script));
		File file = new File("/home/academy/Desktop/tt.txt");
	//	File file = new File(System.getProperty("user.dir") + "/src/test/resources/Algorithm/Algorithm.txt");
				
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println(jse.executeScript(script));

		System.setOut(console);
		System.out.println(jse.executeScript(script));
		System.out.println("--------------------------------");

		cm.com();
		cm.quickAlertMessages();

		// Quick Run

		wait(1);
		click("quickrun_xpath");
		wait(1);
		cm.quickdatasetAlert();
		wait(2);

		WebElement bundle = driver.findElement(By.xpath(or.getProperty("quickbundle_xpath")));
		System.out.println("Clicked on the drop down option");
		log.debug("Clicked on the drop down option");
		Thread.sleep(1000);
		Select bd = new Select(bundle);
		Thread.sleep(2000);
		bd.selectByVisibleText(data.get("StrategyOption"));
		System.out.println("Bundle is selected from drop down");
		log.debug("Bundle is selected from drop down");
		test.log(LogStatus.PASS, "Bundle is selected from drop down");

		click("quickrun_xpath");
		cm.quickstartdateAlert();

		wait(2);
		click("quickStartYearInput_xpath");
		System.out.println("quickStartYearInput_xpath");
		wait(1);
		click("quickStartYearfirst_xpath");
		System.out.println("quickStartYearfirst_xpath");
		wait(1);
		click("quickStartYearsecond_xpath");
		System.out.println("quickStartYearsecond_xpath");
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

		click("quickrun_xpath");
		cm.quickenddateAlert();

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
		type("quickcapital_xpath", con.getProperty("cap1"));
		cm.quickenddateAlert();

		wait(1);

		clear("quickcapital_xpath");
		type("quickcapital_xpath", con.getProperty("cap2"));
		cm.quickcapAlert2();

		wait(1);

		clear("quickcapital_xpath");
		type("quickcapital_xpath", con.getProperty("cap3"));
		cm.quickcapAlert3();
		wait(1);
		clear("quickcapital_xpath");
		type("quickcapital_xpath", data.get("Capital"));
		test.log(LogStatus.PASS, "Entered the starting capital");
		System.out.println("Entered the starting capital");

		wait(1);
		click("quickrun_xpath");
		test.log(LogStatus.PASS, "Clicked on the run button");

		cm.quickTime();

		cm.quickAssert();

	}

	@DataProvider(name = "ReadFromExcelSheet")

	public Object[][] getaData() {
		String sheetName = "QuickRun";
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
