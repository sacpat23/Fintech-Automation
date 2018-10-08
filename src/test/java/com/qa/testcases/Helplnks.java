package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class Helplnks extends BaseTest {

	@Test

	public void helpLinks() {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Help Links");

		wait(2);
		click("helptourlink_xpath");
		test.log(LogStatus.PASS, "User clicked on the Help link");
		wait(2);
		click("gettingStarted_xpath");
		test.log(LogStatus.PASS, "User clicked on the Getting started link");
		wait(2);

		String gettingstartedpagetitle = driver.findElement(By.xpath(or.getProperty("Gettingstartedpagetitle_xpath")))
				.getText();

		if (gettingstartedpagetitle.equals(con.getProperty("gettingstartedtitle"))) {
			System.out.println("Getting Started page => Verified Heading - Coding your algorithm");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Coding your algorithm");
		} else {
			System.out.println("Getting Started page => Verified Heading - Coding your algorithm");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Coding your algorithm");

		}

		click("GettingstartedIntroduction1ink_xpath");

		String introduction = driver.findElement(By.xpath(or.getProperty("Introduction_xpath"))).getText();

		if (introduction.equals(con.getProperty("Intro"))) {
			System.out.println("Getting Started page => Verified Heading - Introduction");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Introduction");
		} else {
			System.out.println("Getting Started page => Verified Heading - Introduction");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Introduction");

		}
		click("Datafetching1ink_xpath");
		String Datafetching = driver.findElement(By.xpath(or.getProperty("Datafetching_xpath"))).getText();

		if (Datafetching.equals(con.getProperty("Datafetch"))) {
			System.out.println("Getting Started page => Verified Heading - Data fetching");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Data fetching");
		} else {
			System.out.println("Getting Started page => Verified Heading - Data fetching");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Data fetching");

		}
		click("Definingstrategylogicandplacingorders1ink_xpath");
		String Definingstrategylogicandplacingorders = driver
				.findElement(By.xpath(or.getProperty("Definingstrategylogicandplacingorders_xpath"))).getText();

		if (Definingstrategylogicandplacingorders.equals(con.getProperty("DFSLO"))) {
			System.out.println("Getting Started page => Verified Heading - Defining strategy logic and placing orders");
			test.log(LogStatus.PASS,
					"Getting Started page => Verified Heading - Defining strategy logic and placing orders");
		} else {
			System.out.println("Getting Started page => Verified Heading - Defining strategy logic and placing orders");
			test.log(LogStatus.PASS,
					"Getting Started page => Verified Heading - Defining strategy logic and placing orders");

		}
		click("Schedulingfunction1ink_xpath");
		String Schedulingfunction = driver.findElement(By.xpath(or.getProperty("Schedulingfunction_xpath"))).getText();

		if (Schedulingfunction.equals(con.getProperty("SF"))) {
			System.out.println("Getting Started page => Verified Heading - Scheduling function");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Scheduling function");
		} else {
			System.out.println("Getting Started page => Verified Heading - Scheduling function");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Scheduling function");

		}
		click("Backtesting1ink_xpath");
		String Backtesting = driver.findElement(By.xpath(or.getProperty("Backtesting_xpath"))).getText();

		if (Backtesting.equals(con.getProperty("BT"))) {
			System.out.println("Getting Started page => Verified Heading - Backtesting");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Backtesting");
		} else {
			System.out.println("Getting Started page => Verified Heading - Backtesting");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Backtesting");

		}
		click("GettingstartedAppendix1ink_xpath");
		String Appendix = driver.findElement(By.xpath(or.getProperty("Appendix_xpath"))).getText();

		if (Appendix.equals(con.getProperty("Append"))) {
			System.out.println("Getting Started page => Verified Heading - Appendix");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Appendix");
		} else {
			System.out.println("Getting Started page => Verified Heading - Appendix");
			test.log(LogStatus.PASS, "Getting Started page => Verified Heading - Appendix");
		}

		// Pipeline

		click("helptourlink_xpath");
		wait(2);
		click("pipeline_xpath");
		System.out.println("User clicked on the Pipeline link");
		test.log(LogStatus.PASS, "User clicked on the Pipeline link");

		wait(2);

		String pipelinepagetitle = driver.findElement(By.xpath(or.getProperty("pipelinepagetitle_xpath"))).getText();

		if (pipelinepagetitle.equals(con.getProperty("pipelinepagetitle"))) {
			System.out.println("Pipeline page => Verified Heading - Pipeline");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Pipeline");
		} else {
			System.out.println("Pipeline page => Verified Heading - Pipeline");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Pipeline");

		}
		wait(1);
		click("PipelineIntroductionlink_xpath");
		String pipelineheading = driver.findElement(By.xpath(or.getProperty("PipelineIntroduction_xpath"))).getText();

		if (pipelineheading.equals(con.getProperty("pipelineintro"))) {
			System.out.println("Pipeline page => Verified Heading - Introduction");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Introduction");
		} else {
			System.out.println("Pipeline page => Verified Heading - Introduction");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Introduction");

		}
		wait(1);
		click("Computationlink_xpath");
		String comp = driver.findElement(By.xpath(or.getProperty("Computation_xpath"))).getText();

		if (comp.equals(con.getProperty("comp"))) {
			System.out.println("Pipeline page => Verified Heading - Computation");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Computation");
		} else {
			System.out.println("Pipeline page => Verified Heading - Computation");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Computation");

		}
		wait(1);
		click("ScreeningtheDatalink_xpath");
		String pipescreeningdata = driver.findElement(By.xpath(or.getProperty("ScreeningtheData_xpath"))).getText();

		if (pipescreeningdata.equals(con.getProperty("screeningdata"))) {
			System.out.println("Pipeline page => Verified Heading - Screening the Data");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Screening the Data");
		} else {
			System.out.println("Pipeline page => Verified Heading - Screening the Data");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Screening the Data");

		}
		wait(1);
		click("PipelineExamplelink_xpath");
		String exam = driver.findElement(By.xpath(or.getProperty("PipelineExample_xpath"))).getText();

		if (exam.equals(con.getProperty("pipelineexam"))) {
			System.out.println("Pipeline page => Verified Heading - Pipeline Example");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Pipeline Example");
		} else {
			System.out.println("Pipeline page => Verified Heading - Pipeline Example");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Pipeline Example");

		}
		wait(1);
		click("PipelineAppendixlink_xpath");
		String pipeappendix = driver.findElement(By.xpath(or.getProperty("pipelineAppendix_xpath"))).getText();

		if (pipeappendix.equals(con.getProperty("pipelineappndix"))) {
			System.out.println("Pipeline page => Verified Heading - Appndix");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Appndix");
		} else {
			System.out.println("Pipeline page => Verified Heading - Appndix");
			test.log(LogStatus.PASS, "Pipeline page => Verified Heading - Appndix");

		}

		// Blueshift Datasets

		click("helptourlink_xpath");
		wait(2);
		click("dataset_xpath");
		System.out.println("User clicked on the Datasets link");
		test.log(LogStatus.PASS, "User clicked on the Datasets link");

		String Blueshiftdatasettitle = driver.findElement(By.xpath(or.getProperty("BlueshiftDatasetsheading_xpath")))
				.getText();

		if (Blueshiftdatasettitle.equals(con.getProperty("BlueshiftDatasetsPageTitle"))) {
			System.out.println("Datasets page => Verified page title  - Blueshift Datasets");
			test.log(LogStatus.PASS, "Datasets page => Verified page title  - Blueshift Datasets");
		} else {
			System.out.println("Datasets page => Verified page title  - Blueshift Datasets");
			test.log(LogStatus.PASS, "Datasets page => Verified page title  - Blueshift Datasets");

		}
		wait(1);
		click("BlueshiftDatasetsIntroductionlink_xpath");
		String BDI = driver.findElement(By.xpath(or.getProperty("BlueshiftdatasetIntroduction_xpath"))).getText();

		if (BDI.equals(con.getProperty("BlueshiftDatasetsIntroduction"))) {
			System.out.println("Datasets page => Verified Heading - Introduction");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - Introduction");
		} else {
			System.out.println("Datasets page => Verified Heading - Introduction");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - Introduction");

		}
		wait(1);
		click("NYSEDailyDatasetlink_xpath");
		String NYSEDDHeader = driver.findElement(By.xpath(or.getProperty("NYSEDailyDataset_xpath"))).getText();

		if (NYSEDDHeader.equals(con.getProperty("NYSEDD"))) {
			System.out.println("Datasets page => Verified Heading - NYSE Daily Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - NYSE Daily Dataset");
		} else {
			System.out.println("Datasets page => Verified Heading - NYSE Daily Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - NYSE Daily Dataset");

		}
		wait(1);
		click("NYSEMinuteDatasetlink_xpath");
		String NYSEMDHeader = driver.findElement(By.xpath(or.getProperty("NYSEMinuteDataset_xpath"))).getText();

		if (NYSEMDHeader.equals(con.getProperty("NYSEMD"))) {
			System.out.println("Datasets page => Verified Heading - NYSE Minute Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - NYSE Minute Dataset");
		} else {
			System.out.println("Datasets page => Verified Heading - NYSE Minute Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - NYSE Minute Dataset");

		}
		wait(1);
		click("NSEDailyDatasetlink_xpath");
		String NSEDDheader = driver.findElement(By.xpath(or.getProperty("NSEDailyDataset_xpath"))).getText();

		if (NSEDDheader.equals(con.getProperty("NSEDD"))) {
			System.out.println("Datasets page => Verified Heading - NSE Daily Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - NSE Daily Dataset");
		} else {
			System.out.println("Datasets page => Verified Heading - NSE Daily Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - NSE Daily Dataset");

		}
		wait(1);
		click("NSEMinuteDatasetlink_xpath");
		String NSEMDheader = driver.findElement(By.xpath(or.getProperty("NSEMinuteDataset_xpath"))).getText();

		if (NSEMDheader.equals(con.getProperty("NSEMD"))) {
			System.out.println("Datasets page => Verified Heading - NSE Minute Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - NSE Minute Dataset");
		} else {
			System.out.println("Datasets page => Verified Heading - NSE Minute Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - NSE Minute Dataset");

		}
		wait(1);
		click("FXCMMinuteDatasetlink_xpath");
		String FXCMD = driver.findElement(By.xpath(or.getProperty("FXCMMinuteDataset_xpath"))).getText();

		if (FXCMD.equals(con.getProperty("FXCMMD"))) {
			System.out.println("Datasets page => Verified Heading - FXCM Minute Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - FXCM Minute Dataset");
		} else {
			System.out.println("Datasets page => Verified Heading - FXCM Minute Dataset");
			test.log(LogStatus.PASS, "Datasets page => Verified Heading - FXCM Minute Dataset");

		}

		/*
		 * String startxpath = ".//*[@id='vbScrollspy']/div/ul/li["; String endxpath =
		 * "]/a";
		 * 
		 * int link = 0;
		 * 
		 * for (int i = 1; i <= 6; i++) {
		 * 
		 * String t = driver.findElement(By.xpath(startxpath + i + endxpath)).getText();
		 * System.out.println(t); wait(1); driver.findElement(By.xpath(startxpath + i +
		 * endxpath)).click();
		 * 
		 * link++;
		 * 
		 * } System.out.println(link);
		 * 
		 * wait(2); click("helptourlink_xpath"); wait(2); click("pipeline_xpath");
		 * test.log(LogStatus.PASS, "User selected Pipe line link"); wait(2);
		 * 
		 * String startxpath1 = ".//*[@id='vbScrollspy']/div/ul/li["; String endxpath1 =
		 * "]/a";
		 * 
		 * int link1 = 0;
		 * 
		 * for (int i = 1; i <= 5; i++) { wait(1); String t =
		 * driver.findElement(By.xpath(startxpath1 + i + endxpath1)).getText();
		 * System.out.println(t); wait(1); driver.findElement(By.xpath(startxpath1 + i +
		 * endxpath1)).click();
		 * 
		 * link1++;
		 * 
		 * }
		 * 
		 * click("helptourlink_xpath"); wait(2); click("dataset_xpath");
		 * 
		 * String t2 =
		 * driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[2]/ul/li[3]/a"
		 * )).getText(); test.log(LogStatus.PASS, "User selected Dataset link");
		 * 
		 * test.log(LogStatus.PASS, t2); String startxpath2 =
		 * ".//*[@id='vbScrollspy']/div/ul/li["; String endxpath2 = "]/a";
		 * 
		 * int link2 = 0;
		 * 
		 * for (int i = 1; i <= 5; i++) { wait(1); String t =
		 * driver.findElement(By.xpath(startxpath2 + i + endxpath2)).getText();
		 * System.out.println(t); wait(1); driver.findElement(By.xpath(startxpath2 + i +
		 * endxpath2)).click();
		 * 
		 * link++;
		 * 
		 * }
		 */

	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
