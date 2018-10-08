package com.qa.testcases;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class Strategy extends BaseTest {

	@Test(dataProvider = "ReadFromExcel")

	public void blueShit(Hashtable<String, String> data) throws Exception {
		// *******************************HomePage**********************************

		/*rep = ExtentManager.getInstance();
		test = rep.startTest("Strategy Page");
		
		click("createnewstrategy_xpath");
		log.debug("Clicked on the Create New Stretegy button");
		test.log(LogStatus.PASS, "Clicked on the Create New Stretegy button");
		System.out.println("Clicked on the Create New Stretegy button");

		type("stretegytitle_xpath", data.get("StrategyName"));
		log.debug("Entered title name");
		test.log(LogStatus.PASS, "Entered title name");
		System.out.println("Entered title name");

		WebElement stretegy = driver.findElement(By.xpath(or.getProperty("selectstretegytemplate")));
		log.debug("Clicked on the drop down list");
		test.log(LogStatus.PASS, "Clicked on the drop down list");
		System.out.println("Clicked on the drop down list");

		Select se = new Select(stretegy);
		se.selectByVisibleText(data.get("StrategyTemplate"));
		log.debug("Stretegy is selected from drop down");
		test.log(LogStatus.PASS, "Stretegy is selected from drop down");
		System.out.println("Stretegy is selected from drop down");

		click("createalgorithm_xpath");
		log.debug("Clicked on the Create Algorithm button");
		test.log(LogStatus.PASS, "Clicked on the Create Algorithm button");
		System.out.println("Clicked on the Create Algorithm button");

		// *******************************Strategy
		// Page**********************************
		click("descriptionbtn_xpath");
		System.out.println("Clicked on description link");

		wait(1);
		type("description_xpath", data.get("Description"));
		log.debug("Enter description");
		test.log(LogStatus.PASS, "Enter description");

		click("style_xpath");
		log.debug("Click on drop down list");
		test.log(LogStatus.PASS, "Click on drop down list");

		wait(1);
		click("styleselect0_xpath");
		log.debug("select risk-factor");
		test.log(LogStatus.PASS, "Select risk-factor");

		wait(1);
		click("style_xpath");
		log.debug("click on drop down list");
		test.log(LogStatus.PASS, "click on drop down list");

		wait(1);
		click("styleselect1_xpath");
		log.debug("select pair trading");
		test.log(LogStatus.PASS, "select pair trading");

		wait(1);
		click("selectAsset_xpath");
		log.debug("Click on Asset");
		test.log(LogStatus.PASS, "Click on Asset");

		wait(1);
		click("asset0_xpath");
		log.debug("select asset");
		test.log(LogStatus.PASS, "select asset");

		wait(1);
		click("selectAsset_xpath");
		log.debug("Click on Asset");
		test.log(LogStatus.PASS, "Click on Asset");

		click("asset1_xpath");
		log.debug("select asset");
		test.log(LogStatus.PASS, "select asset");

		wait(1);
		click("saveStrategy_xpath");
		log.debug("click on save button asset");
		test.log(LogStatus.PASS, "click on save button asset");

		wait(1);
		click("clickStrategysubheader_xpath");
		log.debug("click on the strategy sub header");
		test.log(LogStatus.PASS, "click on the strategy sub header");

		Thread.sleep(1000);
		System.out.println(
				"Strategy Test Name is " + driver.findElement(By.xpath(or.getProperty("verifyname_xpath"))).getText());
		log.debug(driver.findElement(By.xpath(or.getProperty("verifyname_xpath"))).getText());

		wait(1);
		click("strategyname_xpath");
		System.out.println("Clicked on strategy test name");
		log.debug("Clicked on strategy test name");
		test.log(LogStatus.PASS, "Clicked on strategy test name");

		// ************Strategy Dashboard

		click("newBacktest_xpath");
		System.out.println("Clicked on new backtest");
		log.debug("Clicked on new backtest");
		test.log(LogStatus.PASS, "Clicked on new backtest");
		
		
		//-----------------------------------------------------------------------
		wait(1);

		WebElement bundle = driver.findElement(By.xpath(or.getProperty("selectb_xpath")));
		System.out.println("Clicked on the drop down option");
		log.debug("Clicked on the drop down option");
		test.log(LogStatus.PASS, "Clicked on the drop down option");

		Thread.sleep(1000);
		Select bd = new Select(bundle);
		Thread.sleep(2000);
		bd.selectByVisibleText(data.get("StrategyOption"));
		System.out.println("Bundle is selected from drop down");
		log.debug("Bundle is selected from drop down");
		test.log(LogStatus.PASS, "Bundle is selected from drop down");
		
		
		
		
		//-------------------------------------------------------------------------

		click("SYDI_xpath");
		System.out.println("Clicked on date input field");
		test.log(LogStatus.PASS, "Clicked on date input field");

		click("SYDC_xpath");
		System.out.println("Clicked on the date");
		test.log(LogStatus.PASS, "Clicked on the date");

		click("SYDCC_xpath");
		System.out.println("Again Cliked on the date");

		// *****************************Year************************************************

		element("SYF_xpath");
		cm.startYearSelection(data.get("StartYear"));
		System.out.println("Start year selected");
		test.log(LogStatus.PASS, "Year is selected");

		element("SMF_xpath");
		cm.startMonthSelectionString(data.get("StartMonth"));
		System.out.println("Start month selected");
		test.log(LogStatus.PASS, "Month is selected");

		// **********************************Day*************************

		element("SDF_xpath");

		cm.startDaySelection(data.get("StartDay"));
		System.out.println("Start day selected");
		test.log(LogStatus.PASS, "Day is selected");

		// ********************************End Date Input

		click("EDYI_xpath");
		click("EDYC_xpath");
		click("EDYCC_xpath");

		// ***********************End Year *********************************

		element("EYDF_xpath");

		cm.endYearSelection(data.get("EndYear"));
		System.out.println("End Year is selected");
		test.log(LogStatus.PASS, "End Year is selected");

		// *************************************End Month
		cm.endMonthSelection(data.get("EndMonth"));
		System.out.println("Month is selected");
		test.log(LogStatus.PASS, "Month is selected");

		// *************************************End
		// Day***********************************

		element("EDF_xpath");

		cm.endDaySelection(data.get("EndDay"));
		System.out.println("Day is selected");
		test.log(LogStatus.PASS, "Day is selected");

		clear("SCIC_xpath");
		type("SCSK_xpath", data.get("Capital"));

		test.log(LogStatus.PASS, "Enter the start capital");

		Thread.sleep(1000);

		WebElement bundle = driver.findElement(By.xpath(or.getProperty("selectb_xpath")));
		System.out.println("Clicked on the drop down option");
		log.debug("Clicked on the drop down option");
		test.log(LogStatus.PASS, "Clicked on the drop down option");

		Thread.sleep(1000);
		Select bd = new Select(bundle);
		Thread.sleep(2000);
		bd.selectByVisibleText(data.get("StrategyOption"));
		System.out.println("Bundle is selected from drop down");
		log.debug("Bundle is selected from drop down");
		test.log(LogStatus.PASS, "Bundle is selected from drop down");

		click("runbtn_xpath");
		System.out.println("Clicked on Run button");
		log.debug("Clicked on Run button");
		test.log(LogStatus.PASS, "Backtest Run");

		click("backtest_xpath");
		log.debug("Clicked on BackTest link");
		System.out.println("Clicked on BackTest link");
		test.log(LogStatus.PASS, "Clicked on BackTest link");

		wait(20);
		cm.getElementFRomTable();
		cm.checkConditionForError();
		cm.checkConditionForStartingCapital(data.get("StartingCapital"));
		cm.checkConditionForEndingCapital(data.get("EndingCapital"));
		cm.checkForAnnualReturns(data.get("AnnualReturns"));
		cm.checkForAnnualVolatility(data.get("AnnualVolatility"));
		cm.checkForSharpeRatio(data.get("SharpeRatio"));
		cm.checkForStabilityofTimeseries(data.get("StabilityofTimeseries"));

		click("SL_xpath");
		System.out.println("click on startegy home link");
		test.log(LogStatus.PASS, "Redirect to the Strategy Home Page");*/

	}

	@DataProvider(name = "ReadFromExcel")

	public Object[][] getaData() {
		String sheetName = "Sheet1";
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
