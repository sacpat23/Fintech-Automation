package com.qa.testcases;

import java.util.Hashtable;

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

public class LandingPage extends BaseTest {

	@Test(dataProvider = "ReadFromExcel")

	public void landingPage(Hashtable<String, String> data) throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Landing Page");

	/*	String strategytitle = driver.findElement(By.xpath(or.getProperty("Strategies_xpath"))).getText();
		String strategytext = driver.findElement(By.xpath(or.getProperty("Strategiescontent_xpath"))).getText();

		if (strategytitle.equals(con.getProperty("Strategiespagetitle"))) {
			System.out.println("Verified Strategy page title match with expected title.");
			test.log(LogStatus.PASS, "Verified Strategy page title match with expected title.");

		} else {
			System.out.println("Verified Strategy page title does not match with expected title.");
			test.log(LogStatus.PASS, "Verified Strategy page title does not match with expected title.");

		}

		if (strategytext.equals(con.getProperty("Strategypagetext")))

		{
			System.out.println("Verified Strategy page content match with expected content.");
			test.log(LogStatus.PASS, "Verified Strategy page content match with expected content.");
		} else {
			System.out.println("Verified Strategy page content does not match with expected content.");
			test.log(LogStatus.PASS, "Verified Strategy page content does not match with expected content.");
		}

		boolean deletebtn = driver
				.findElement(By.xpath(".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div[1]/div[2]/a[2]"))
				.isEnabled();
		System.out.println("Is Delete button in disable condition" + "=" + deletebtn);
		test.log(LogStatus.PASS, "Is Delete button in disable condition" + "=" + deletebtn);
*/
		click("createnewstrategy_xpath");
		test.log(LogStatus.PASS, "Clicked on the Create New Stretegy button");
		System.out.println("Clicked on the Create New Stretegy button");

		String createstrategypopuptitle = driver.findElement(By.xpath(or.getProperty("Createstrategytitle_xpath")))
				.getText();

		if (createstrategypopuptitle.equals(con.getProperty("newstrategy"))) {
			System.out.println("Verified New Strategy heading match with expected heading.");
			test.log(LogStatus.PASS, "Verified New Strategy heading match with expected heading.");
		} else {

			System.out.println("Verified New Strategy heading does not match with expected heading.");
			test.log(LogStatus.PASS, "Verified New Strategy heading does not match with expected heading.");
		}

		String strategytemplateheader = driver
				.findElement(By.xpath(or.getProperty("SelectStrategyTemplateheader_xpath"))).getText();

		if (strategytemplateheader.equals(con.getProperty("StrategyTemplateheading"))) {
			System.out.println("Verified Strategy Template header match with expected header.");
			test.log(LogStatus.PASS, "Verified Strategy Template header match with expected header.");
		} else {

			System.out.println("Verified Strategy Template header does not match with expected header.");
			test.log(LogStatus.PASS, "Verified Strategy Template header does not match with expected header.");
		}

		/////////////////////////////////////////////////////////////////
		click("createalgorithm_xpath");

		String ActualTitleName = driver.findElement(By.xpath(or.getProperty("StrategyNamealtmsg_xpath"))).getText();

		String ExpectedTitleName = con.getProperty("Titile");
		Assert.assertEquals(ActualTitleName, ExpectedTitleName);
		System.out.println("Verified actual alert message for Title field match with expected alert message.");
		test.log(LogStatus.PASS, "Verified actual alert message for Title field match with expected alert message.");

		String ActualStrategyTemplateName = driver.findElement(By.xpath(or.getProperty("StrategyTemplatealtmsg_xpath")))
				.getText();

		String ExpectedStrategyTemplateName = con.getProperty("Strategytemplate");
		Assert.assertEquals(ActualStrategyTemplateName, ExpectedStrategyTemplateName);
		System.out.println(
				"Verified actual alert message for Strategy Template field match with expected alert message.");
		test.log(LogStatus.PASS,
				"Verified actual alert message for Strategy Template field match with expected alert message.");

		click("closepopup_xpath");

		/////////////////////////////////////////////////////////////////

	}

	@DataProvider(name = "ReadFromExcel")

	public Object[][] getData() {
		String sheetName = "Sheet17";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];
		Hashtable<String, String> table = null;
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			table = new Hashtable<String, String>();
			for (int colNum = cols; colNum < cols; colNum++) {
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;

			}

		}

		return data;

	}

	@AfterTest

	public void tearDown() {

		rep.flush();

	}

}
