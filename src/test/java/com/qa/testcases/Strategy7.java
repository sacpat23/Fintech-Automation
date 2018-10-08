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
import com.mysql.cj.jdbc.Driver;
import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class Strategy7 extends BaseTest {

	@Test(dataProvider = "ReadFromExcel")

	public void blueShit(Hashtable<String, String> data) throws Exception {
		// *******************************HomePage**********************************

		rep = ExtentManager.getInstance();
		test = rep.startTest("Strategy & Back Test");

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

		// ************Strategy Dashboard *****************88
		Thread.sleep(2000);
		click("newBacktest_xpath");
		System.out.println("Clicked on new backtest");
		log.debug("Clicked on new backtest");
		test.log(LogStatus.PASS, "Clicked on new backtest");
		/////////////////////////////////////////////////////////////////
		Thread.sleep(2000);
		click("runbtn_xpath");

		wait(1);

		cm.datasetAlert();

		// ##################Dataset assertion ###################################

		// String ActualDatasetaltmsg =
		// driver.findElement(By.xpath(or.getProperty("Datasetaltmsg_xpath"))).getText();
		// String ExpectedDatasetaltmsg = con.getProperty("Dataset");
		// Assert.assertEquals(ActualDatasetaltmsg, ExpectedDatasetaltmsg);
		// System.out.println("Actual Dataset and Expected Dataset matched");
		// test.log(LogStatus.PASS, "Actual Dataset and Expected Dataset matched");

		/////////////////////////////////////////////////////////////////

		wait(1);
		WebElement bundle = driver.findElement(By.xpath(or.getProperty("selectb_xpath")));
		System.out.println("Clicked on the drop down option");
		log.debug("Clicked on the drop down option");
		test.log(LogStatus.PASS, "Clicked on the drop down option");

		Thread.sleep(2000);
		Select bd = new Select(bundle);
		Thread.sleep(5000);
		bd.selectByVisibleText(data.get("StrategyOption"));
		System.out.println("Bundle is selected from drop down");
		log.debug("Bundle is selected from drop down");
		test.log(LogStatus.PASS, "Bundle is selected from drop down");

		// -------------------------------------------------------------------------

		click("runbtn_xpath");
		cm.startdateAlert();
		// Start date assertion
		// String ActualStartDatealtmsg =
		// driver.findElement(By.xpath(or.getProperty("StartDatealtmsg_xpath"))).getText();
		//
		// String ExpectedStartDatealtmsg = con.getProperty("StartDate");
		// Assert.assertEquals(ActualStartDatealtmsg, ExpectedStartDatealtmsg);
		// System.out.println("Actual StartDate and Expected StartDate matched");
		// test.log(LogStatus.PASS, "Actual StartDate and Expected StartDate matched");

		/////////////////////////////////////////////////////////////

		Thread.sleep(2000);
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

		Thread.sleep(4000);
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
		// -----------------------------------------------------------------------

		// String ActualEndDatealtmsg =
		// driver.findElement(By.xpath(or.getProperty("EndDatealtmsg_xpath"))).getText();
		//
		// String ExpectedEndDatealtmsg = con.getProperty("EndDate");
		// Assert.assertEquals(ActualEndDatealtmsg, ExpectedEndDatealtmsg);
		// System.out.println("Actual EndDate and Expected EndDate matched");
		// test.log(LogStatus.PASS, "Actual EndDate and Expected EndDate matched");

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
		////////////////////////////////////////////////////////////////////
		/*
		 * Thread.sleep(8000); clear("SCIC_xpath"); Thread.sleep(8000);
		 * click("runbtn_xpath"); Thread.sleep(8000); String ActualCapitalaltmsg =
		 * driver.findElement(By.xpath(or.getProperty("Capitalaltmsg_xpath"))).getText()
		 * ;
		 * 
		 * String ExpectedCapitalaltmsg = con.getProperty("Capitalreq");
		 * Assert.assertEquals(ActualCapitalaltmsg, ExpectedCapitalaltmsg);
		 * System.out.println("Actual Capitalreq and Expected Capitalreq matched");
		 * test.log(LogStatus.PASS,
		 * "Actual Capitalreq and Expected Capitalreq matched");
		 */

		///////////////////////////////////////////////////////////////

		clear("SCIC_xpath");

		type("SCSK_xpath", con.getProperty("cap1"));

		click("runbtn_xpath");
		cm.capAlert1();

		// Capital assertion 1

		//
		// String ActualCapitalfielddigitvalaltmsg = driver
		// .findElement(By.xpath(or.getProperty("Capitalfielddigitvalaltmsg_xpath"))).getText();
		//
		// String ExpectedCapitalfielddigitvalaltmsg = con.getProperty("Capitalval");
		// Assert.assertEquals(ActualCapitalfielddigitvalaltmsg,
		// ExpectedCapitalfielddigitvalaltmsg);
		// System.out.println(
		// "Actual The Capital field must be 1 or more. alert message and Expected The
		// Capital field must be 1 or more. message is matched");
		// test.log(LogStatus.PASS, "Actual Capitalval and Expected Capitalval
		// matched");

		////////////////////////////////////////////////////////////////////
		Thread.sleep(1000);
		clear("SCIC_xpath");

		type("SCSK_xpath", con.getProperty("cap2"));
		Thread.sleep(1000);
		click("runbtn_xpath");
		cm.capAlert2();

		// Capital assertion 2
		// String ActualCapitalfieldcharaltmsg = driver
		// .findElement(By.xpath(or.getProperty("Capitalfieldcharaltmsg_xpath"))).getText();
		//
		// String ExpectedCapitalfieldcharaltmsg = con.getProperty("Capitalval1");
		// Assert.assertEquals(ActualCapitalfieldcharaltmsg,
		// ExpectedCapitalfieldcharaltmsg);
		// System.out.println("Actual & Expected alert message match");
		// test.log(LogStatus.PASS, "Actual Capital val1 and Expected Capitalval1
		// matched");

		///////////////////////////////////////////////
		Thread.sleep(1000);
		clear("SCIC_xpath");

		type("SCSK_xpath", con.getProperty("cap3"));

		click("runbtn_xpath");
		cm.capAlert3();

		// Capital assertion 3

		// String ActualCapitalfiledlengthaltmsg = driver
		// .findElement(By.xpath(or.getProperty("Capitalfiledlengthaltmsg_xpath"))).getText();
		//
		// String ExpectedCapitalfiledlengthaltmsg = con.getProperty("Capitalval2");
		// Assert.assertEquals(ActualCapitalfiledlengthaltmsg,
		// ExpectedCapitalfiledlengthaltmsg);
		// System.out.println(
		// "Actual The Capital field must be 100000000 or less. alert message and
		// Expected The Capital field must be 100000000 or less. message is matched");
		// test.log(LogStatus.PASS, "Actual Capitalval2 and Expected Capitalval2
		// matched");

		///////////////////////////////////

		clear("SCIC_xpath");

		type("SCSK_xpath", data.get("Capital"));
		test.log(LogStatus.PASS, "Enter the start capital");

		/*
		 * WebElement bundle =
		 * driver.findElement(By.xpath(or.getProperty("selectb_xpath")));
		 * System.out.println("Clicked on the drop down option");
		 * log.debug("Clicked on the drop down option"); test.log(LogStatus.PASS,
		 * "Clicked on the drop down option");
		 * 
		 * Thread.sleep(1000); Select bd = new Select(bundle); Thread.sleep(2000);
		 * bd.selectByVisibleText(data.get("StrategyOption"));
		 * System.out.println("Bundle is selected from drop down");
		 * log.debug("Bundle is selected from drop down"); test.log(LogStatus.PASS,
		 * "Bundle is selected from drop down");
		 */

		click("runbtn_xpath");
		System.out.println("Clicked on Run button");
		log.debug("Clicked on Run button");
		test.log(LogStatus.PASS, "Backtest Run");

		wait(2);
		click("backtest_xpath");
		log.debug("Clicked on BackTest link");
		System.out.println("Clicked on BackTest link");
		test.log(LogStatus.PASS, "Clicked on BackTest link");

		wait(30);
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
		
		
		
		//delete the strategy

		// ===========================1 st Iteration New Back Test

		// driver.navigate().refresh();
		wait(2);
		click("newbacktestbtn_xpath");
		System.out.println("Clicked on New back test button");
		test.log(LogStatus.PASS, "Clicked on New back test button");

		wait(2);

		// WebElement bundle1 =
		// driver.findElement(By.xpath(or.getProperty("newbacktestdataset_xpath")));
		// System.out.println("Clicked on the drop down option");
		// log.debug("Clicked on the drop down option");
		// test.log(LogStatus.PASS, "Clicked on the drop down option");
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		// Select bd1 = new Select(bundle1);
		// Thread.sleep(10000);
		// bd.selectByVisibleText(data.get("StrategyOption1"));
		// System.out.println("Bundle is selected from drop down");
		// log.debug("Bundle is selected from drop down");
		// test.log(LogStatus.PASS, "Bundle is selected from drop down");

		click("newbacktestdatasetstartdate_xpath");
		System.out.println("Clicked on date input field");
		test.log(LogStatus.PASS, "Clicked on date input field");

		wait(3);
		click("newbackteststartyear1_xpath");
		System.out.println("Clicked on the date");
		test.log(LogStatus.PASS, "Clicked on the date");

		wait(3);
		click("newbackteststartyear2_xpath");
		System.out.println("Again Cliked on the date");

		element("newbackteststartyearoutfiled_xpath");

		cm.startYearSelection1(data.get("StartYear1"));
		System.out.println("Start year selected");
		test.log(LogStatus.PASS, "Start Year is selected");

		// ###################################################

		wait(3);
		element("newbackteststartmonthouter_xpath");
		cm.startMonthSelection1(data.get("StartMonth1"));
		System.out.println("Start month selected");
		test.log(LogStatus.PASS, "Start Month is selected");

		// ******************Day*************************
		wait(3);
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

		Thread.sleep(1000);
		clear("newbacktestdatasetstartingcapital_xpath");
		Thread.sleep(1000);
		type("newbacktestdatasetstartingcapital_xpath", data.get("Capital1"));
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Entered the start capital");

		click("newbacktestrunbtn_xpath");
		System.out.println("Clicked on Run button");
		log.debug("Clicked on Run button");
		test.log(LogStatus.PASS, "Clicked on the Backtest Run button");

		wait(15);
		cm.getElementFromTable();

		wait(1);
		cm.checkConditionForError();
		/*
		 * System.out.
		 * println("Status for backtest is Error- further execution will not happen because of error"
		 * ); log.
		 * debug("Status for backtest is Error- further execution will not happen because of error"
		 * ); test.log(LogStatus.PASS,
		 * "Status for backtest is Error- further execution will not happen because of error "
		 * );
		 */

		// =====================================================================================================
		wait(1);
		cm.checkConditionForStartingCapital(data.get("StartingCapital1"));
		cm.checkConditionForEndingCapital(data.get("EndingCapital1"));
		cm.checkForAnnualReturns(data.get("AnnualReturns1"));
		cm.checkForAnnualVolatility(data.get("AnnualVolatility1"));
		cm.checkForSharpeRatio(data.get("SharpeRatio1"));
		cm.checkForStabilityofTimeseries(data.get("StabilityofTimeseries1"));

		wait(2);

		click("tearsheetlink_xpath");

		System.out.println("Click on Tear sheet link");
		test.log(LogStatus.PASS, "Tear sheet page open");

		wait(2);
		click("transactionslink_xpath");

		System.out.println("Click on Transactions link");
		test.log(LogStatus.PASS, "Transactions page open");

		wait(2);
		click("errorloglink_xpath");

		System.out.println("Click on Error log link");
		test.log(LogStatus.PASS, "Error log page open");

		wait(2);
		click("outputloglink_xpath");

		System.out.println("Click on Output log link");
		test.log(LogStatus.PASS, "Output log page open");

		wait(2);
		click("codelink_xpath");

		System.out.println("Click on Code link");
		test.log(LogStatus.PASS, "Code page open");

		wait(2);
		click("backtestslink_xpath");
		System.out.println("Click on back test link");

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
		cm.getElementFromTable();
		wait(1);
		cm.checkConditionForError();

		// =====================================================================================================
		wait(1);
		cm.checkConditionForStartingCapital(data.get("StartingCapital2"));
		cm.checkConditionForEndingCapital(data.get("EndingCapital2"));
		cm.checkForAnnualReturns(data.get("AnnualReturns2"));
		cm.checkForAnnualVolatility(data.get("AnnualVolatility2"));
		cm.checkForSharpeRatio(data.get("SharpeRatio2"));
		cm.checkForStabilityofTimeseries(data.get("StabilityofTimeseries2"));

		wait(2);

		click("tearsheetlink_xpath");

		System.out.println("Click on Tear sheet link");
		test.log(LogStatus.PASS, "Tear sheet page open");

		wait(2);
		click("transactionslink_xpath");

		System.out.println("Click on Transactions link");
		test.log(LogStatus.PASS, "Transactions page open");

		wait(2);
		click("errorloglink_xpath");

		System.out.println("Click on Error log link");
		test.log(LogStatus.PASS, "Error log page open");

		wait(2);
		click("outputloglink_xpath");

		System.out.println("Click on Output log link");
		test.log(LogStatus.PASS, "Output log page open");

		wait(2);
		click("codelink_xpath");

		System.out.println("Click on Code link");
		test.log(LogStatus.PASS, "Code page open");

		wait(2);
		click("backtestslink_xpath");
		System.out.println("Click on back test link");

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

		wait(3);
		click("close_xpath");
		System.out.println("Clicked on close button");
		test.log(LogStatus.PASS, "Clicked on close button");

		wait(2);
		click("secondcheckbox_xpath");
		wait(2);
		cm.removebacktestStrategy();
		wait(2);
		click("maincheckbox_xpath");
		wait(2);
		cm.removebacktestStrategy();

		cm.nobacktestPresentOnPageValidation();
		wait(2);
		click("backtestlink_xpath");
		wait(1);

		// ======================================
		// break;
	}
	// }

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
