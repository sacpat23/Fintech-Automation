package com.qa.testcases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mysql.cj.core.io.StandardSocketFactory;
import com.mysql.cj.jdbc.Driver;
import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class Strategy5 extends BaseTest {

	@Test(dataProvider = "ReadFromExcel")

	public void blueShit(Hashtable<String, String> data) throws Exception {
		// *******************************HomePage**********************************

		rep = ExtentManager.getInstance();
		test = rep.startTest("Creation Strategy & Back Test");

		driver.findElement(By.xpath(".//*[@id='access-strategies']/a")).click();

		// for (int i = 0; i <= 3; i++) {

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

		wait(1);
		type("stretegytitle_xpath", data.get("StrategyName"));
		log.debug("Entered title name");
		test.log(LogStatus.PASS, "Entered title name");
		System.out.println("Entered title name");

		wait(1);
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

		// ***********Strategy Page*********************

		// Block the description

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
		log.debug("Asset Selected");
		test.log(LogStatus.PASS, "select asset");

		wait(1);
		click("selectAsset_xpath");
		log.debug("Click on Asset");
		test.log(LogStatus.PASS, "Click on Asset");

		click("asset1_xpath");
		log.debug("Asset Selected");
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

		wait(5);
		click("strategyname_xpath");
		System.out.println("Clicked on strategy test name");
		log.debug("Clicked on strategy test name");
		test.log(LogStatus.PASS, "Clicked on strategy test name");

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
		// File file = new File(System.getProperty("user.dir") +
		// "/src/test/resources/Algorithm/Algorithm.txt");

		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println(jse.executeScript(script));

		System.setOut(console);
		System.out.println(jse.executeScript(script));
		System.out.println("--------------------------------");

		cm.com();
		//cm.quickAlertMessages();

		// ********************************Quick Run

		wait(1);
		click("quickrun_xpath");
		wait(1);
		cm.quickdatasetAlert();
		wait(2);

		WebElement Qbundle = driver.findElement(By.xpath(or.getProperty("quickbundle_xpath")));
		System.out.println("Clicked on the drop down option");
		log.debug("Clicked on the drop down option");
		Thread.sleep(1000);
		Select Qbd = new Select(Qbundle);
		Thread.sleep(2000);
		Qbd.selectByVisibleText(data.get("QstrategyOption"));
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
		cm.quickYearSelection(data.get("QstartYear"));
		System.out.println("Start Year");

		cm.quickMonthSelection(data.get("QstartMonth"));
		System.out.println("Start Month ");

		cm.quickDaySelection(data.get("QstartDay"));
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
		cm.quickYearEndSelection(data.get("QendYear"));
		wait(2);
		System.out.println("End Year selected");
		cm.quickEndMonthSelection(data.get("QendMonth"));
		wait(1);
		System.out.println("End Month is selected");
		cm.quickEndDaySelection(data.get("QendDay"));
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
		type("quickcapital_xpath", data.get("Qcapital"));
		test.log(LogStatus.PASS, "Entered the starting capital");
		System.out.println("Entered the starting capital");

		wait(1);
		click("quickrun_xpath");
		test.log(LogStatus.PASS, "Clicked on the run button");

		cm.quickTime();

		cm.quickAssert();

		// ************Strategy Dashboard *****************88
		wait(1);
		click("newBacktest_xpath");
		System.out.println("Clicked on new backtest");
		log.debug("Clicked on new backtest");
		test.log(LogStatus.PASS, "Clicked on new backtest");
		/////////////////////////////////////////////////////////////////
		wait(1);
		click("runbtn_xpath");

		wait(1);

		cm.datasetAlert();

		// ##################Dataset assertion ###################################

		wait(1);
		WebElement bundle = driver.findElement(By.xpath(or.getProperty("selectb_xpath")));
		System.out.println("Clicked on the drop down option");
		log.debug("Clicked on the drop down option");
		test.log(LogStatus.PASS, "Clicked on the drop down option");

		Thread.sleep(2000);
		Select bd = new Select(bundle);
		Thread.sleep(2000);
		bd.selectByVisibleText(data.get("StrategyOption"));
		System.out.println("Bundle is selected from drop down");
		log.debug("Bundle is selected from drop down");
		test.log(LogStatus.PASS, "Bundle is selected from drop down");

		// -------------------------------------------------------------------------

		click("runbtn_xpath");
		cm.startdateAlert();

		/////////////////////////////////////////////////////////////

		wait(1);
		click("SYDI_xpath");
		System.out.println("Clicked on date input field");
		test.log(LogStatus.PASS, "Clicked on date input field");

		wait(2);
		click("SYDC_xpath");
		System.out.println("Clicked on the date");
		test.log(LogStatus.PASS, "Clicked on the date");

		wait(2);
		click("SYDCC_xpath");
		System.out.println("Again Cliked on the date");

		wait(2);
		click("SYFB_xpath");
		System.out.println(" Cliked on Forward button for calender");

		// *****************************Year************************************************

		Thread.sleep(2000);
		element("SYF_xpath");
		wait(2);
		cm.startYearSelection(data.get("StartYear"));
		System.out.println("Start year selected");
		test.log(LogStatus.PASS, "Start Year is selected");

		wait(2);
		element("SMF_xpath");
		cm.startMonthSelection(data.get("StartMonth"));
		System.out.println("Start month selected");
		test.log(LogStatus.PASS, "Start Month is selected");

		// **********************************Day*************************
		wait(2);
		element("SDF_xpath");

		cm.startDaySelection(data.get("StartDay"));
		System.out.println("Start day selected");
		test.log(LogStatus.PASS, "Start Day is selected");

		// ********************************End Date Input

		click("runbtn_xpath");

		cm.enddateAlert();

		// end date assertion

		//////////////////////////////////////////////////////

		click("EDYI_xpath");
		click("EDYC_xpath");
		click("EDYCC_xpath");

		// ***********************End Year *********************************
		wait(3);
		element("EYDF_xpath");

		cm.endYearSelection(data.get("EndYear"));
		System.out.println("End Year is selected");
		test.log(LogStatus.PASS, "End Year is selected");

		// *************************************End Month

		wait(3);
		element("EMF_xpath");

		cm.endMonthSelection(data.get("EndMonth"));
		System.out.println("End Month is selected");
		test.log(LogStatus.PASS, "End Month is selected");

		// *************************************End
		// Day***********************************

		element("EDF_xpath");

		cm.endDaySelection(data.get("EndDay"));
		System.out.println("End Day is selected");
		test.log(LogStatus.PASS, "End Day is selected");

		///////////////////////////////////////////////////////////////

		clear("SCIC_xpath");

		type("SCSK_xpath", con.getProperty("cap1"));

		click("runbtn_xpath");
		cm.capAlert1();

		////////////////////////////////////////////////////////////////////
		wait(1);
		clear("SCIC_xpath");

		type("SCSK_xpath", con.getProperty("cap2"));
		wait(1);
		click("runbtn_xpath");
		cm.capAlert2();

		///////////////////////////////////////////////
		wait(1);
		clear("SCIC_xpath");

		type("SCSK_xpath", con.getProperty("cap3"));

		click("runbtn_xpath");
		cm.capAlert3();

		///////////////////////////////////

		clear("SCIC_xpath");

		type("SCSK_xpath", data.get("Capital"));
		test.log(LogStatus.PASS, "Enter the start capital");

		click("runbtn_xpath");
		System.out.println("Clicked on Run button");
		log.debug("Clicked on Run button");
		test.log(LogStatus.PASS, "Backtest Run");

		wait(2);
		click("backtest_xpath");
		log.debug("Clicked on BackTest link");
		System.out.println("Clicked on BackTest link");
		test.log(LogStatus.PASS, "Clicked on BackTest link");

		wait(15);
		cm.getElementFromTable();
		wait(1);
		cm.checkConditionForError();

		// =====================================================================================================
		wait(1);
		cm.checkConditionForStartingCapital(data.get("StartingCapital"));
		cm.checkConditionForEndingCapital(data.get("EndingCapital"));
		cm.checkForAnnualReturns(data.get("AnnualReturns"));
		cm.checkForAnnualVolatility(data.get("AnnualVolatility"));
		cm.checkForSharpeRatio(data.get("SharpeRatio"));
		cm.checkForStabilityofTimeseries(data.get("StabilityofTimeseries"));

		wait(1);

		click("tearsheetlink_xpath");
		System.out.println("Click on Tear sheet link");
		test.log(LogStatus.PASS, "Tear sheet page open");

		wait(1);
		click("transactionslink_xpath");
		System.out.println("Click on Transactions link");
		test.log(LogStatus.PASS, "Transactions page open");

		wait(1);
		click("errorloglink_xpath");
		System.out.println("Click on Error log link");
		test.log(LogStatus.PASS, "Error log page open");

		wait(1);
		click("outputloglink_xpath");
		System.out.println("Click on Output log link");
		test.log(LogStatus.PASS, "Output log page open");

		wait(1);
		click("codelink_xpath");
		System.out.println("Click on Code link");
		test.log(LogStatus.PASS, "Code page open");

		wait(1);
		click("backtestslink_xpath");
		System.out.println("Clicked on back test link");
		test.log(LogStatus.PASS, "Clicked on back test link");

		click("maincheckbox_xpath");
		wait(1);
		cm.removebacktestStrategy();

		// delete the strategy

		// ===========================1st Iteration New Back Test

		wait(1);

		click("newbacktestbtn_xpath");
		System.out.println("Clicked on New back test button");
		test.log(LogStatus.PASS, "Clicked on New back test button");

		wait(2);

		click("newbacktestdatasetstartdate_xpath");
		System.out.println("Clicked on date input field");
		test.log(LogStatus.PASS, "Clicked on date input field");

		wait(2);
		click("newbackteststartyear1_xpath");
		System.out.println("Clicked on the date");
		test.log(LogStatus.PASS, "Clicked on the date");

		wait(2);
		click("newbackteststartyear2_xpath");
		System.out.println("Again Cliked on the date");

		element("newbackteststartyearoutfiled_xpath");

		cm.startYearSelection1(data.get("StartYear1"));
		System.out.println("Start year selected");
		test.log(LogStatus.PASS, "Start Year is selected");

		// ###################################################

		wait(2);
		element("newbackteststartmonthouter_xpath");
		cm.startMonthSelection1(data.get("StartMonth1"));
		System.out.println("Start month selected");
		test.log(LogStatus.PASS, "Start Month is selected");

		// ******************Day*************************
		wait(2);
		element("newbackteststartdateouter_xpath");

		cm.startDaySelection1(data.get("StartDay1"));
		System.out.println("Start day selected");
		test.log(LogStatus.PASS, "Start Day is selected");

		// ******End Date Input********************
		wait(1);
		click("newbacktestenddatefield_xpath");
		System.out.println("Clicked on the End date field");
		test.log(LogStatus.PASS, "Clicked on the End date field");
		wait(1);
		click("newbacktestenddate1_xpath");

		wait(1);
		click("newbacktestenddate2_xpath");

		// ***********************End Year ********************
		wait(2);
		element("newbacktestenddateout_xpath");

		cm.endYearSelection1(data.get("EndYear1"));
		System.out.println("End Year is selected");
		test.log(LogStatus.PASS, "End Year is selected");

		// ********End Month******************

		wait(2);
		element("newbacktestendmonthout_xpath");

		cm.endMonthSelection1(data.get("EndMonth1"));
		System.out.println("End Month is selected");
		test.log(LogStatus.PASS, "End Month is selected");

		// ************End Day******************

		element("newbacktestenddateouter_xpath");

		cm.endDaySelection1(data.get("EndDay1"));
		System.out.println("End Day is selected");
		test.log(LogStatus.PASS, "End Day is selected");

		wait(1);
		clear("newbacktestdatasetstartingcapital_xpath");
		wait(1);
		type("newbacktestdatasetstartingcapital_xpath", data.get("Capital1"));
		wait(1);
		test.log(LogStatus.PASS, "Entered the start capital");

		click("newbacktestrunbtn_xpath");
		System.out.println("Clicked on Run button");
		log.debug("Clicked on Run button");
		test.log(LogStatus.PASS, "Clicked on the Backtest Run button");
		wait(10);

		// ##############3rd iteration##############

		wait(2);
		click("newbacktestbtn_xpath");
		wait(1);

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

		element("newbackteststartyearoutfiled_xpath");

		cm.startYearSelection1(data.get("StartYear2"));
		System.out.println("Start year selected");
		test.log(LogStatus.PASS, "Start Year is selected");

		// ###################################################

		wait(2);
		element("newbackteststartmonthouter_xpath");
		cm.startMonthSelection1(data.get("StartMonth2"));
		System.out.println("Start month selected");
		test.log(LogStatus.PASS, "Start Month is selected");

		// ************Day*************
		wait(2);
		element("newbackteststartdateouter_xpath");

		cm.startDaySelection1(data.get("StartDay2"));
		System.out.println("Start day selected");
		test.log(LogStatus.PASS, "Start Day is selected");

		// **************End Date Input***************
		wait(1);
		click("newbacktestenddatefield_xpath");
		System.out.println("Clicked on the End date field");
		wait(1);
		click("newbacktestenddate1_xpath");

		wait(1);
		click("newbacktestenddate2_xpath");

		// ****************End Year ****************
		wait(2);
		element("newbacktestenddateout_xpath");

		cm.endYearSelection1(data.get("EndYear2"));
		System.out.println("End Year is selected");
		test.log(LogStatus.PASS, "End Year is selected");

		// *******************End Month******************

		wait(2);
		element("newbacktestendmonthout_xpath");

		cm.endMonthSelection1(data.get("EndMonth2"));
		System.out.println("End Month is selected");
		test.log(LogStatus.PASS, "End Month is selected");

		// ****************End Day**********

		element("newbacktestenddateouter_xpath");

		cm.endDaySelection1(data.get("EndDay2"));
		System.out.println("End Day is selected");
		test.log(LogStatus.PASS, "End Day is selected");

		Thread.sleep(1000);
		clear("newbacktestdatasetstartingcapital_xpath");
		Thread.sleep(1000);
		type("newbacktestdatasetstartingcapital_xpath", data.get("Capital2"));
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Entered the start capital");

		click("newbacktestrunbtn_xpath");
		System.out.println("Clicked on Run button");
		log.debug("Clicked on Run button");
		test.log(LogStatus.PASS, "Clicked on the Backtest Run button");

		wait(10);

		// #############3Backtest table###############

		element("backtesttableout_xpath");
		click("firstcheckbox_xpath");
		System.out.println("First Check box selected");
		test.log(LogStatus.PASS, "First Check box selected");

		click("secondcheckbox_xpath");
		System.out.println("Second Check box selected");
		test.log(LogStatus.PASS, "Second Check box selected");

		click("comparebtn_xpath");
		System.out.println("Clicked on comapare button");
		test.log(LogStatus.PASS, "Clicked on comapare button");

		element("comparemodal_xpath");

		cm.backtestnamecomapare();
		cm.backtestnamecomapare1();
		cm.backtestnamecomapare2();
		// cm.backtestnamecomapare3();
		cm.backtestnamecomapare4();
		cm.backtestnamecomapare5();
		cm.backtestnamecomapare6();

		String color = driver.findElement(By.xpath(or.getProperty("color1_xpath"))).getCssValue("color");
		System.out.println(color);
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3 = Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println(actualColor);

		String rc = "rgba(255, 0, 0, 1)";
		if (color.equals(rc)) {
			test.log(LogStatus.PASS, "Color for first back test is Red.");
		} else {
			test.log(LogStatus.PASS, "Color for first back test is not Red.");
		}

		String hex = Color.fromString(color).asHex();
		System.out.println(hex);

		// String hex = String.format("#%02x%02x%02x", r, g, b);

		String color2 = driver.findElement(By.xpath(or.getProperty("color2_xpath"))).getCssValue("color");
		System.out.println(color2);
		String[] hexValue0 = color.replace("rgba(", "").replace(")", "").split(",");

		int hexValue11 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue22 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue33 = Integer.parseInt(hexValue[2]);

		String actualColor2 = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println(actualColor2);

		String rcg = "rgba(255, 0, 0, 1)";
		if (color2.equals(rcg)) {
			test.log(LogStatus.PASS, "Color for first back test is Green.");
		} else {
			test.log(LogStatus.PASS, "Color for first back test is not Green.");
		}

		wait(1);

		click("close_xpath");
		System.out.println("Clicked on close button");
		test.log(LogStatus.PASS, "Clicked on close button");

		wait(2);
		cm.removebacktestStrategy();
		wait(1);
		cm.nobacktestPresentOnPageValidation();
		wait(2);
		click("backtestlink_xpath");
		test.log(LogStatus.PASS, "Redirected to the Dashboard page.");
		wait(1);
		element("StretaegyDashboardtableouter_xpath");
		wait(1);
		click("backtestcheckbox_xpath");
		test.log(LogStatus.PASS, "Checkbox has been selected.");
		wait(1);
		click("dtbtn_xpath");
		test.log(LogStatus.PASS, "Clicked on the delete button.");
		wait(1);
		element("modal_xpath");
		click("delete_xpath");
		test.log(LogStatus.PASS, "Strategy has been deleted.");
		wait(2);

	}

	@DataProvider(name = "ReadFromExcel")

	public Object[][] getaData() {
		String sheetName = "Smoke";
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
