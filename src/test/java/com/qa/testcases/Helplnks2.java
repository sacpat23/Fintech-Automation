package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class Helplnks2 extends BaseTest {

	@Test

	public void helpLinks() {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Help Links");

		wait(2);
		click("helptourlink_xpath");
		test.log(LogStatus.PASS, "User clicked on the Help link");
		wait(2);
		click("gettingStarted_xpath");
		test.log(LogStatus.PASS, "User selected Getting started link");
		wait(2);
		String startxpath = ".//*[@id='vbScrollspy']/div/ul/li[";
		String endxpath = "]/a";

		int link = 0;

		for (int i = 1; i <= 6; i++) {

			String t = driver.findElement(By.xpath(startxpath + i + endxpath)).getText();
			System.out.println(t);
			wait(1);
			driver.findElement(By.xpath(startxpath + i + endxpath)).click();

			link++;

		}
		System.out.println(link);

		wait(2);
		click("helptourlink_xpath");
		wait(2);
		click("pipeline_xpath");
		test.log(LogStatus.PASS, "User selected Pipe line link");
		wait(2);

		String startxpath1 = ".//*[@id='vbScrollspy']/div/ul/li[";
		String endxpath1 = "]/a";

		int link1 = 0;

		for (int i = 1; i <= 5; i++) {
			wait(1);
			String t = driver.findElement(By.xpath(startxpath1 + i + endxpath1)).getText();
			System.out.println(t);
			wait(1);
			driver.findElement(By.xpath(startxpath1 + i + endxpath1)).click();

			link1++;

		}

		click("helptourlink_xpath");
		wait(2);
		click("dataset_xpath");
		
		String t2 = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[2]/ul/li[3]/a")).getText();
		test.log(LogStatus.PASS, "User selected Dataset link");
		
		test.log(LogStatus.PASS, t2);
		String startxpath2 = ".//*[@id='vbScrollspy']/div/ul/li[";
		String endxpath2 = "]/a";

		int link2 = 0;

		for (int i = 1; i <= 5; i++) {
			wait(1);
			String t = driver.findElement(By.xpath(startxpath2 + i + endxpath2)).getText();
			System.out.println(t);	
			wait(1);
			driver.findElement(By.xpath(startxpath2 + i + endxpath2)).click();

			link++;

		}

	}



	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
