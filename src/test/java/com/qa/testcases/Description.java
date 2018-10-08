package com.qa.testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class Description extends BaseTest {

	@Test(dataProvider = "ReadFromExcel")

	public void description(Hashtable<String, String> data) throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Description");

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

		click("descriptionbtn_xpath");
		System.out.println("Clicked on description link");
		test.log(LogStatus.PASS, "User cliked on the Description link");

		wait(1);
		type("description_xpath", data.get("Description"));
		log.debug("Given the input into the description text field.");
		test.log(LogStatus.PASS, "Given the input into the description text field.");

		click("style_xpath");
		log.debug("Clicked on the Style drop down list");
		test.log(LogStatus.PASS, "Clicked on the Style drop down list");
		// ###########################################

		driver.findElement(By.xpath(or.getProperty("styleouter_xpath")));

		// cm.option(data.get("opt"));

		click("first_xpath");
		wait(1);
		System.out.println("Mean Reversion option is selected from drop down list.");
		test.log(LogStatus.PASS, "Mean Reversion option is selected from drop down list.");

		click("style_xpath");
		wait(1);
		click("second_xpath");
		System.out.println("Momentum option is selected from drop down list.");
		test.log(LogStatus.PASS, "Momentum option is selected from drop down list.");

		click("style_xpath");
		wait(1);
		click("third_xpath");
		System.out.println("Risk Factor option is selected from drop down list.");
		test.log(LogStatus.PASS, "Risk Factor option is selected from drop down list.");

		// ##################################################################
		wait(1);
		click("style_xpath");
		wait(1);
		click("fourth_xpath");
		System.out.println("Smart Beta option is selected from drop down list.");
		test.log(LogStatus.PASS, "Smart Beta option is selected from drop down list.");

		wait(1);
		click("selectAsset_xpath");
		log.debug("Clicked on Asset drop down field.");
		test.log(LogStatus.PASS, "Clicked on Asset drop down field.");

		wait(1);
		// element("selectAssetouter_xpath");
		click("selectAsset1_xpath");
		System.out.println("ETF option is selected from drop down list");
		test.log(LogStatus.PASS, "ETF option is selected from drop down list.");

		wait(1);
		click("selectAsset_xpath");
		click("selectAsset2_xpath");
		System.out.println("Equity option is selected from drop down list.");
		test.log(LogStatus.PASS, "Equity option is selected from drop down list..");

		wait(1);
		click("selectAsset_xpath");
		click("selectAsset3_xpath");
		System.out.println("Equity Futures option is selected from drop down list.");
		test.log(LogStatus.PASS, "Equity Futures option selected from drop down list.");

		wait(1);
		click("selectAsset_xpath");
		click("selectAsset4_xpath");

		System.out.println("FX option selected.");
		test.log(LogStatus.PASS, "FX option is selected from drop down list.");

		click("saveStrategy_xpath");
		log.debug("Clicked on save button asset");
		test.log(LogStatus.PASS, "Clicked on save button");

		driver.navigate().refresh();
		click("descriptionbtn_xpath");

		wait(2);
		String Dtitle = driver.findElement(By.xpath(or.getProperty("descriptiontitle_xpath"))).getAttribute("value");
		System.out.println(Dtitle);

		if (Dtitle.equals(data.get("StrategyName"))) {
			System.out.println("Actual Title is matched with expected Title");
			test.log(LogStatus.PASS, "Actual Title is matched with expected Title");
		} else {
			System.out.println("Actual Title is not matched with expected Title");
			test.log(LogStatus.PASS, "Actual Title is not matched with expected Title");

		}

		wait(1);
		String Des = driver.findElement(By.xpath(or.getProperty("description_xpath"))).getAttribute("value");
		System.out.println(Des);

		if (Des.equals(data.get("Description"))) {
			System.out.println("Actual Description text is matched with expected description.");
			test.log(LogStatus.PASS, "Actual Description text is matched with expected description.");
		} else {
			System.out.println("Actual Description text is not matched with expected description.");
			test.log(LogStatus.PASS, "Actual Description text is not matched with expected description.");

		}

		String t = driver.findElement(By.xpath(or.getProperty("MeanReversionOpt_xpath"))).getText()
				.replace("Mean Reversion ×", "Mean Reversion");

		if (t.equals(con.getProperty("c1")))

		{
			System.out.println("Mean Reversion option is matched with expected option list.");
			test.log(LogStatus.PASS, "Mean Reversion option is matched with expected option.");
		} else {
			System.out.println("Mean Reversion option option is not matched with expected option");
			test.log(LogStatus.PASS, "Mean Reversion option option is not matched with expected option");
		}

		String k = driver.findElement(By.xpath(or.getProperty("MomentumOpt_xpath"))).getText().replace("Momentum ×",
				"Momentum");

		if (k.equals(con.getProperty("c2")))

		{
			System.out.println("Momentum option is matched with expected option.");
			test.log(LogStatus.PASS, "Momentum option is matched with expected option.");
		} else {
			System.out.println("Momentum option is not matched with expected option.");
			test.log(LogStatus.PASS, "Momentum option is not matched with expected option.");
		}

		String k1 = driver.findElement(By.xpath(or.getProperty("RiskFactorOpt_xpath"))).getText()
				.replace("Risk Factor ×", "Risk Factor");

		if (k1.equals(con.getProperty("c3")))

		{
			System.out.println("Risk Factor option is matched with expected option.");
			test.log(LogStatus.PASS, "Risk Factor option is matched with expected option.");
		} else {
			System.out.println("Risk Factor option is not matched with expected option.");
			test.log(LogStatus.PASS, "Risk Factor option is not matched with expected option.");
		}

		String k2 = driver.findElement(By.xpath(or.getProperty("SmartBetaOpt_xpath"))).getText().replace("Smart Beta ×",
				"Smart Beta");

		if (k2.equals(con.getProperty("c4")))

		{
			System.out.println("Smart Beta option is matched with expected option.");
			test.log(LogStatus.PASS, "Smart Beta option is matched with expected option.");
		} else {
			System.out.println("Smart Beta option is matched with expected option.");
			test.log(LogStatus.PASS, "Smart Beta option is not matched with expected option.");
		}

		String sa1 = driver.findElement(By.xpath(or.getProperty("ETFOpt_xpath"))).getText().replace("ETF ×", "ETF");

		if (sa1.equals(con.getProperty("d1"))) {
			System.out.println("ETF option matched with expected option.");
			test.log(LogStatus.PASS, "ETF option matched with expected option.");
		} else {

			System.out.println("ETF option not matched with expected option.");
			test.log(LogStatus.PASS, "ETF option not matched with expected option.");
		}

		String sa2 = driver.findElement(By.xpath(or.getProperty("EquityOpt_xpath"))).getText().replace("Equity ×",
				"Equity");

		if (sa2.equals(con.getProperty("d2"))) {
			System.out.println("Equity option matched with expected option.");
			test.log(LogStatus.PASS, "Equity option matched with expected option.");
		} else {

			System.out.println("Equity option not matched with expected option.");
			test.log(LogStatus.PASS, "Equity option not matched with expected option.");
		}

		String sa3 = driver.findElement(By.xpath(or.getProperty("EquityFuturesOpt_xpath"))).getText()
				.replace("Equity Futures ×", "Equity Futures");

		if (sa3.equals(con.getProperty("d3"))) {
			System.out.println("Equity Futures option matched with expected option.");
			test.log(LogStatus.PASS, "Equity Futures option matched with expected option.");
		} else {

			System.out.println("Equity Futures option not matched with expected option.");
			test.log(LogStatus.PASS, "Equity Futures option not matched with expected option.");
		}

		String sa4 = driver.findElement(By.xpath(or.getProperty("FXOpt_xpath"))).getText().replace("FX ×", "FX");

		if (sa4.equals(con.getProperty("d4"))) {
			System.out.println("FX option matched with expected option.");
			test.log(LogStatus.PASS, "FX option matched with expected option.");
		} else {

			System.out.println("FX option not matched with expected option.");
			test.log(LogStatus.PASS, "FX option not matched with expected option.");
		}

		wait(1);

		click("clickStrategysubheader_xpath");

		wait(2);

		if (Dtitle.equals(driver.findElement(By.xpath(or.getProperty("r1"))).getText())) {
			System.out.println("Strategy Title is matched with expected Title");
			test.log(LogStatus.PASS, "Strategy Title is matched with expected Title");
		} else {
			System.out.println("Strategy Title is not matched with expected Title");
			test.log(LogStatus.PASS, "Strategy Title is not matched with expected Title");

		}

		
		
		
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		
		
		
		
		
		
		
		
		wait(2);
		String kp = driver.findElement(By.xpath(
				".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div[2]/div/div/div/div[1]/table/tbody/tr/td[3]/div/span"))
				.getAttribute("title");

		if (kp.equals(con.getProperty("v1"))) {
			System.out.println("Actual and expected Style is matched");
			test.log(LogStatus.PASS, "Actual and expected Style is matched");

		} else {
			System.out.println("Actual and expected Style not matched");
			test.log(LogStatus.PASS, "Actual and expected Style not matched");
		}

		String h = driver.findElement(By.xpath(
				".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div[2]/div/div/div/div[1]/table/tbody/tr/td[4]/div/span"))
				.getAttribute("title");
		if (h.equals(con.getProperty("v2"))) {
			System.out.println("Actual and expected Asset is matched");
			test.log(LogStatus.PASS, "Actual and expected Asset is matched");
		} else {
			System.out.println("Actual and expected Asset not matched");
			test.log(LogStatus.PASS, "Actual and expected Asset not matched");
		}

		/*
		 * Actions act = new Actions(driver);
		 * 
		 * wait(2); Action ha = act.moveToElement(e).build(); wait(2); ha.perform();
		 */

		// act.moveToElement(e).perform();
		// act.clickAndHold(e).build().perform();

		// act.moveToElement(e).perform();
		// System.out.println(kl.getAttribute("title"));

		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver; WebElement ele =
		 * driver.findElement(By.xpath(
		 * ".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div[2]/div/div/div/div[1]/table/tbody/tr/td[3]/div/span/text()"
		 * )); Thread.sleep(5000); js.executeScript("arguments[0].click();", ele);
		 * System.out.println("Successfully clicked on the dots");
		 */

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
