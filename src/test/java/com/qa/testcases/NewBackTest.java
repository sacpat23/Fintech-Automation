package com.qa.testcases;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class NewBackTest extends BaseTest {

	@Test(dataProvider = "ReadFromExcel")

	public void newBackTest(Hashtable<String, String> data) throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Strategy Page");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

		wait(2);
		type("stretegytitle_xpath", data.get("StrategyName"));
		log.debug("Entered title name");
		test.log(LogStatus.PASS, "Entered title name");
		System.out.println("Entered title name");

		wait(2);
		WebElement stretegy = driver.findElement(By.xpath(or.getProperty("selectstretegytemplate")));
		log.debug("Clicked on the drop down list");
		test.log(LogStatus.PASS, "Clicked on the drop down list");
		System.out.println("Clicked on the drop down list");

		wait(4);
		Select se = new Select(stretegy);
		se.selectByVisibleText(data.get("StrategyTemplate"));
		log.debug("Stretegy is selected from drop down");
		test.log(LogStatus.PASS, "Stretegy is selected from drop down");
		System.out.println("Stretegy is selected from drop down");

		wait(2);
		click("createalgorithm_xpath");
		log.debug("Clicked on the Create Algorithm button");
		test.log(LogStatus.PASS, "Clicked on the Create Algorithm button");
		System.out.println("Clicked on the Create Algorithm button");

		// ***********Strategy Page*********************
		wait(2);
		click("strategylink_xpath");
		wait(8);
		click("backtest0_xpath");
		wait(2);
		click("newbacktestbtn_xpath");
		// click("newbacktestbtn1");

		// ************Strategy Dashboard *****************
		
		click("newbacktestrunbtn_xpath");
		
		String ActualDatasetaltmsg = driver.findElement(By.xpath(or.getProperty("datasetfield1_xpath"))).getText();
		String ExpectedDatasetaltmsg = con.getProperty("Dataset");
		Assert.assertEquals(ActualDatasetaltmsg, ExpectedDatasetaltmsg);
		System.out.println("Actual Dataset and Expected Dataset matched");
		test.log(LogStatus.PASS, "Actual Dataset and Expected Dataset matched");
		
		
		
		
		
		

		wait(4);
		WebElement bundle = driver.findElement(By.xpath(or.getProperty("newbacktestdataset_xpath")));
		System.out.println("Clicked on the drop down option");
		log.debug("Clicked on the drop down option");
		test.log(LogStatus.PASS, "Clicked on the drop down option");

		Thread.sleep(3000);
		Select bd = new Select(bundle);
		Thread.sleep(5000);
		bd.selectByVisibleText(data.get("StrategyOption"));
		System.out.println("Bundle is selected from drop down");
		log.debug("Bundle is selected from drop down");
		test.log(LogStatus.PASS, "Bundle is selected from drop down");

		// -------------------------------------------------------------------------
		
		
		click("newbacktestrunbtn_xpath");
		
        String ActualStartDatealtmsg = driver.findElement(By.xpath(or.getProperty("StartDatefield1_xpath"))).getText();
		
		String ExpectedStartDatealtmsg = con.getProperty("StartDate");
		Assert.assertEquals(ActualStartDatealtmsg, ExpectedStartDatealtmsg);
		System.out.println("Actual StartDate and Expected StartDate matched");
		test.log(LogStatus.PASS, "Actual StartDate and Expected StartDate matched");
		
		
		

		Thread.sleep(4000);
		click("newbacktestdatasetstartdate_xpath");
		System.out.println("Clicked on date input field");
		test.log(LogStatus.PASS, "Clicked on date input field");

		wait(5);
		click("newbackteststartyear1_xpath");
		System.out.println("Clicked on the date");
		test.log(LogStatus.PASS, "Clicked on the date");

		wait(3);
		click("newbackteststartyear2_xpath");
		System.out.println("Again Cliked on the date");

		wait(3);
		click("newbackteststartyear3_xpath");
		System.out.println(" Cliked on Forward button for calender");

		// *****************************Year************************************************

		Thread.sleep(4000);
	    element("newbackteststartyearforward_xpath");
		wait(2);

		cm.startYearSelection1(data.get("StartYear"));
		System.out.println("Start year selected");
		test.log(LogStatus.PASS, "Start Year is selected");

		// ###################################################

		wait(3);
		element("newbackteststartmonthouter_xpath");
		cm.startMonthSelection1(data.get("StartMonth"));
		System.out.println("Start month selected");
		test.log(LogStatus.PASS, "Start Month is selected");

		// **********************************Day*************************
		wait(3);
		element("newbackteststartdateouter_xpath");

		cm.startDaySelection1(data.get("StartDay"));
		System.out.println("Start day selected");
		test.log(LogStatus.PASS, "Start Day is selected");

		// ********************************End Date Input
		
		
		click("newbacktestrunbtn_xpath");
		String ActualEndDatealtmsg = driver.findElement(By.xpath(or.getProperty("EndDatefield1_xpath"))).getText();
		
		String ExpectedEndDatealtmsg = con.getProperty("EndDate");
		Assert.assertEquals(ActualEndDatealtmsg, ExpectedEndDatealtmsg);
		System.out.println("Actual EndDate and Expected EndDate matched");
		test.log(LogStatus.PASS, "Actual EndDate and Expected EndDate matched");
		
		
		

		wait(1);
		click("newbacktestenddatefield_xpath");
		System.out.println("Clicked on the End date field");
		wait(1);
		click("newbacktestenddate1_xpath");

		wait(1);
		click("newbacktestenddate2_xpath");

		// ***********************End Year *********************************
		wait(3);
		element("newbacktestenddateout_xpath");

		cm.endYearSelection1(data.get("EndYear"));
		System.out.println("End Year is selected");
		test.log(LogStatus.PASS, "End Year is selected");

		// *************************************End Month

		wait(3);
		element("newbacktestendmonthout_xpath");

		cm.endMonthSelection1(data.get("EndMonth"));
		System.out.println("End Month is selected");
		test.log(LogStatus.PASS, "End Month is selected");

		// *************************************End
		// Day***********************************

		element("newbacktestenddateouter_xpath");

		cm.endDaySelection1(data.get("EndDay"));
		System.out.println("End Day is selected");
		test.log(LogStatus.PASS, "End Day is selected");
		
	///	##################
	//	1
		
//		
//		clear("newbacktestdatasetstartingcapital_xpath");
//		Thread.sleep(1000);
//		type("newbacktestdatasetstartingcapital_xpath", con.getProperty("cap1"));
//		
//				
//		String ActualCapitalfielddigitvalaltmsg = driver
//				.findElement(By.xpath(or.getProperty("Capitalfield1_xpath"))).getText();
//
//		String ExpectedCapitalfielddigitvalaltmsg = con.getProperty("Capitalval1");
//		Assert.assertEquals(ActualCapitalfielddigitvalaltmsg, ExpectedCapitalfielddigitvalaltmsg);
//		System.out.println("Actual Capitalval and Expected Capitalval matched");
//		test.log(LogStatus.PASS, "Actual Capitalval and Expected Capitalval matched");
		
		
		
//		//2
//		
//		
//		clear("newbacktestdatasetstartingcapital_xpath");
//		Thread.sleep(1000);
//		type("newbacktestdatasetstartingcapital_xpath", con.getProperty("cap1"));
//		
//		String ActualCapitalfielddigitvalaltmsg2 = driver
//				.findElement(By.xpath(or.getProperty("Capitalfield2_xpath"))).getText();
//
//		String ExpectedCapitalfielddigitvalaltmsg2= con.getProperty("Capitalval");
//		Assert.assertEquals(ActualCapitalfielddigitvalaltmsg2, ExpectedCapitalfielddigitvalaltmsg2);
//		System.out.println("Actual Capitalval and Expected Capitalval matched");
//		test.log(LogStatus.PASS, "Actual Capitalval and Expected Capitalval matched");
//		
//	  //   3
//		
//		
//		clear("newbacktestdatasetstartingcapital_xpath");
//		Thread.sleep(1000);
//		type("newbacktestdatasetstartingcapital_xpath", con.getProperty("cap2"));
//		
//		String ActualCapitalfielddigitvalaltmsg3 = driver
//				.findElement(By.xpath(or.getProperty("Capitalfield3_xpath"))).getText();
//
//		String ExpectedCapitalfielddigitvalaltmsg3= con.getProperty("Capitalval1");
//		Assert.assertEquals(ActualCapitalfielddigitvalaltmsg3, ExpectedCapitalfielddigitvalaltmsg3);
//		System.out.println("Actual Capitalval and Expected Capitalval matched");
//		test.log(LogStatus.PASS, "Actual Capitalval and Expected Capitalval matched");
//		
//		
//
//		Thread.sleep(1000);
//		clear("newbacktestdatasetstartingcapital_xpath");
//		Thread.sleep(1000);
//		type("newbacktestdatasetstartingcapital_xpath", data.get("Capital"));
//		Thread.sleep(1000);
//		test.log(LogStatus.PASS, "Enter the start capital");
//*************************************************************************************************
		
		Thread.sleep(1000);
		clear("newbacktestdatasetstartingcapital_xpath");
		Thread.sleep(1000);
		type("newbacktestdatasetstartingcapital_xpath", con.getProperty("cap1"));
		Thread.sleep(1000);
		
		String ActualCapitalfielddigitvalaltmsg = driver
				.findElement(By.xpath(or.getProperty("Capitalfield1_xpath"))).getText();

		String ExpectedCapitalfielddigitvalaltmsg = con.getProperty("Capitalval");
		Assert.assertEquals(ActualCapitalfielddigitvalaltmsg, ExpectedCapitalfielddigitvalaltmsg);
		System.out.println("Actual Capitalval and Expected Capitalval matched");
		test.log(LogStatus.PASS, "Actual Capitalval and Expected Capitalval matched");

		////////////////////////////////////////////////////////////////////
		Thread.sleep(1000);
		clear("newbacktestdatasetstartingcapital_xpath");
		Thread.sleep(1000);
		type("newbacktestdatasetstartingcapital_xpath", con.getProperty("cap2"));
		Thread.sleep(5000);
		
		String ActualCapitalfieldcharaltmsg = driver
				.findElement(By.xpath(or.getProperty("Capitalfield2_xpath"))).getText();

		String ExpectedCapitalfieldcharaltmsg = con.getProperty("Capitalval1");
		Assert.assertEquals(ActualCapitalfieldcharaltmsg, ExpectedCapitalfieldcharaltmsg);
		System.out.println("Actual Capitalval1 and Expected Capitalval1 matched");
		test.log(LogStatus.PASS, "Actual Capitalval1 and Expected Capitalval1 matched");

		///////////////////////////////////////////////
		Thread.sleep(1000);
		clear("newbacktestdatasetstartingcapital_xpath");
		Thread.sleep(1000);
		type("newbacktestdatasetstartingcapital_xpath", con.getProperty("cap3"));
		Thread.sleep(1000);
		
		String ActualCapitalfiledlengthaltmsg = driver
				.findElement(By.xpath(or.getProperty("Capitalfield3_xpath"))).getText();

		String ExpectedCapitalfiledlengthaltmsg = con.getProperty("Capitalval2");
		Assert.assertEquals(ActualCapitalfiledlengthaltmsg, ExpectedCapitalfiledlengthaltmsg);
		System.out.println("Actual Capitalval2 and Expected Capitalval2 matched");
		test.log(LogStatus.PASS, "Actual Capitalval2 and Expected Capitalval2 matched");

		///////////////////////////////////
		Thread.sleep(1000);
		clear("newbacktestdatasetstartingcapital_xpath");
		Thread.sleep(1000);
		type("newbacktestdatasetstartingcapital_xpath", data.get("Capital"));
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Enter the start capital");
		
		
		
		
		
		
		
		
		Thread.sleep(1000);

		click("newbacktestrunbtn_xpath");
		System.out.println("Clicked on Run button");
		log.debug("Clicked on Run button");
		test.log(LogStatus.PASS, "Backtest Run");

		wait(30);
		cm.getElementFromTable();
		wait(1);
		cm.checkConditionForError();
		wait(15);
		cm.checkConditionForStartingCapital(data.get("StartingCapital"));
		cm.checkConditionForEndingCapital(data.get("EndingCapital"));
		cm.checkForAnnualReturns(data.get("AnnualReturns"));
		cm.checkForAnnualVolatility(data.get("AnnualVolatility"));
		cm.checkForSharpeRatio(data.get("SharpeRatio"));
		cm.checkForStabilityofTimeseries(data.get("StabilityofTimeseries"));
		
	

	}

	@DataProvider(name = "ReadFromExcel")

	public Object[][] getaData() {
		String sheetName = "Fibonacci Retracement Strategy (NYSE Minutes)";
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
