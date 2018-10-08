package com.qa.custom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class CustomeMethods extends BaseTest {

	public void checkConditionForError() {
		if (driver.findElement(By.xpath(or.getProperty("FBTN_xpath"))).getText().equals("Error")) {
			System.out.println("Error occuered");
			test.log(LogStatus.PASS, "Error occuered");
			driver.close();
			test.log(LogStatus.PASS, "Error found sttoped the test");
		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			String first_xpath = ".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div[2]/div/div/div/div[1]/table/tbody/tr[";
			String second_xpath = "]/td[9]/div/a";

			int rowNum = 0;

			for (int i = 0; i <= 4; i++) {
				driver.findElement(By.xpath(first_xpath + i + second_xpath));
				rowNum++;

				// driver.findElement(By.xpath(or.getProperty("compltedbtn_xpath"))).click();
				log.debug("Clicked on complete button");
				System.out.println("Clicked on complete button");
				test.log(LogStatus.PASS, "Clicked on complete button");

			}

		}
	}

	public void checkConditionForStartingCapital1(String SC) {

		if (driver.findElement(By.xpath(or.getProperty("SCD_xpath"))).getText().equals(SC)) {
			System.out.println("Actual & Expected Starting Captial Match");
			test.log(LogStatus.PASS, "Actual & Expected Starting Captial Match");
		} else {
			System.out.println("Actual & Expected Starting Captial not Match");
			test.log(LogStatus.PASS, "Actual & Expected Starting Captial not Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[1]/div/div/div[3]/div[2]"))
							.getText());
		}

	}

	public void checkConditionForEndingCapital1(String EC) {

		if (driver.findElement(By.xpath(or.getProperty("ECD_xpath"))).getText().equals(EC)) {
			System.out.println("Ending capital match");
			test.log(LogStatus.PASS, "Actual & Expected Ending capital match");
		} else {
			System.out.println("Ending capital not match");
			test.log(LogStatus.PASS, "Actual & Expected Ending Capital not Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[1]/div/div/div[4]/div[2]"))
							.getText());
		}
	}

	public void checkForAnnualReturns(String AR) {

		if (driver.findElement(By.xpath(or.getProperty("AR_xpath"))).getText().equals(AR)) {
			System.out.println("Anual Return match");
			test.log(LogStatus.PASS, "Actual & Expected Anual Return Match");
		} else {
			System.out.println("Anual Return not match");
			test.log(LogStatus.PASS,
					"Actual & Expected Anual Return not Match." + " Actual Result is = " + driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div[2]"))
							.getText());
		}

	}

	public void checkForAnnualVolatility(String AV) {

		if (driver.findElement(By.xpath(or.getProperty("AV_xpath"))).getText().equals(AV)) {
			System.out.println("Anual Volatility match");
			test.log(LogStatus.PASS, "Actual & Expected Anual Volatility Match");
		} else {
			System.out.println("Anual Volatility not match");
			test.log(LogStatus.PASS, "Actual & Expected Anual Volatility not Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[2]/div[2]/div[3]/div[2]"))
							.getText());
		}

	}

	public void checkForSharpeRatio(String SR) {

		if (driver.findElement(By.xpath(or.getProperty("SR_xpath"))).getText().equals(SR)) {
			System.out.println("Sharp Ratio capital match");
			test.log(LogStatus.PASS, "Actual & Expected Sharp Ratio capital Match");
		} else {
			System.out.println("Sharp Ratio not match");
			test.log(LogStatus.PASS, "Actual & Expected Sharp Ratio not capital Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[2]/div[2]/div[3]/div[4]"))
							.getText());
		}
	}

	public void checkForStabilityofTimeseries(String STS) {

		if (driver.findElement(By.xpath(or.getProperty("STS_xpath"))).getText().equals(STS)) {
			System.out.println("Stability of Timeseries  match");
			test.log(LogStatus.PASS, "Actual & Expected Stability of Timeseries Match");
		} else {
			System.out.println("Stability of Timeseries is not match");
			test.log(LogStatus.PASS, "Actual & Expected Stability of Timeseries not Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[2]/div[2]/div[9]/div[2]"))
							.getText());
		}

	}

	// Duplicate======================================

	public void checkConditionForStartingCapital(String SC1) {

		if (driver.findElement(By.xpath(or.getProperty("SCD_xpath"))).getText().equals(SC1)) {
			System.out.println("Actual & Expected Starting Captial Match");
			test.log(LogStatus.PASS, "Actual & Expected Starting Captial Match");
		} else {
			System.out.println("Actual & Expected Starting Captial not Match");
			test.log(LogStatus.PASS, "Actual & Expected Starting Captial not Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[1]/div/div/div[3]/div[2]"))
							.getText());
		}

	}

	public void checkConditionForEndingCapital(String EC1) {

		if (driver.findElement(By.xpath(or.getProperty("ECD_xpath"))).getText().equals(EC1)) {
			System.out.println("Ending capital match");
			test.log(LogStatus.PASS, "Actual & Expected Ending capital match");
		} else {
			System.out.println("Ending capital not match");
			test.log(LogStatus.PASS, "Actual & Expected Ending Capital not Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[1]/div/div/div[4]/div[2]"))
							.getText());
		}
	}

	public void checkForAnnualReturns1(String AR1) {

		if (driver.findElement(By.xpath(or.getProperty("AR_xpath"))).getText().equals(AR1)) {
			System.out.println("Anual Return match");
			test.log(LogStatus.PASS, "Actual & Expected Anual Return Match");
		} else {
			System.out.println("Anual Return not match");
			test.log(LogStatus.PASS,
					"Actual & Expected Anual Return not Match." + " Actual Result is = " + driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[2]/div[2]/div[1]/div[2]"))
							.getText());
		}

	}

	public void checkForAnnualVolatility1(String AV1) {

		if (driver.findElement(By.xpath(or.getProperty("AV_xpath"))).getText().equals(AV1)) {
			System.out.println("Anual Volatility match");
			test.log(LogStatus.PASS, "Actual & Expected Anual Volatility Match");
		} else {
			System.out.println("Anual Volatility not match");
			test.log(LogStatus.PASS, "Actual & Expected Anual Volatility not Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[2]/div[2]/div[3]/div[2]"))
							.getText());
		}

	}

	public void checkForSharpeRatio1(String SR1) {

		if (driver.findElement(By.xpath(or.getProperty("SR_xpath"))).getText().equals(SR1)) {
			System.out.println("Sharp Ratio capital match");
			test.log(LogStatus.PASS, "Actual & Expected Sharp Ratio capital Match");
		} else {
			System.out.println("Sharp Ratio not match");
			test.log(LogStatus.PASS, "Actual & Expected Sharp Ratio not capital Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[2]/div[2]/div[3]/div[4]"))
							.getText());
		}
	}

	public void checkForStabilityofTimeseries1(String STS1) {

		if (driver.findElement(By.xpath(or.getProperty("STS_xpath"))).getText().equals(STS1)) {
			System.out.println("Stability of Timeseries  match");
			test.log(LogStatus.PASS, "Actual & Expected Stability of Timeseries Match");
		} else {
			System.out.println("Stability of Timeseries is not match");
			test.log(LogStatus.PASS, "Actual & Expected Stability of Timeseries not Match." + " Actual Result is = "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/section[2]/div/div/div/div[2]/div[2]/div[9]/div[2]"))
							.getText());
		}

	}

	// ===================================================
	public void datasetAlert() {

		if (driver.findElement(By.xpath(or.getProperty("Datasetaltmsg_xpath"))).getText()
				.equals(con.getProperty("Dataset"))) {
			System.out.println("Actual Dataset and Expected Dataset matched");
			test.log(LogStatus.PASS, "Actual Dataset and Expected Dataset matched");
		} else {
			System.out.println("Actual Dataset and Expected Dataset not matched");
			test.log(LogStatus.PASS, "Actual Dataset and Expected Dataset not matched");
		}

	}
	//

	public void startdateAlert() {

		if (driver.findElement(By.xpath(or.getProperty("StartDatealtmsg_xpath"))).getText()
				.equals(con.getProperty("StartDate"))) {
			System.out.println("Actual Start Date and Expected Start Date matched");
			test.log(LogStatus.PASS, "Actual Start Date and Expected Start Date matched");
		} else {
			System.out.println("Actual Start Date and Expected Start Date not matched");
			test.log(LogStatus.PASS, "Actual Start Date and Expected Start Date not matched");
		}

	}

	//

	public void enddateAlert() {

		if (driver.findElement(By.xpath(or.getProperty("EndDatealtmsg_xpath"))).getText()
				.equals(con.getProperty("EndDate"))) {
			System.out.println("Actual End Date and Expected End Date matched");
			test.log(LogStatus.PASS, "Actual End Date and Expected End Date matched");
		} else {
			System.out.println("Actual End Date and Expected End Date not matched");
			test.log(LogStatus.PASS, "Actual EndDate and Expected End Date not matched");
		}

	}
	//

	public void capAlert1() {

		if (driver.findElement(By.xpath(or.getProperty("Capitalfielddigitvalaltmsg_xpath"))).getText()
				.equals(con.getProperty("Capitalval"))) {
			System.out.println(
					"Actual & Expected alert message is matched. Message is - The Capital field must be 1 or more.");
			test.log(LogStatus.PASS,
					"Actual & Expected alert message is matched. Message is - The Capital field must be 1 or more.");
		} else {

			System.out.println("Actual & Expected alert message does not match. Actual Message is" + "-"
					+ con.getProperty("Capitalval") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());
			test.log(LogStatus.PASS, "Actual & Expected alert message does not match. Actual Message is" + "-"
					+ con.getProperty("Capitalval") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());

		}

	}

	//
	public void capAlert2() {

		if (driver.findElement(By.xpath(or.getProperty("Capitalfieldcharaltmsg_xpath"))).getText()
				.equals(con.getProperty("Capitalval1"))) {
			System.out.println(
					"Actual & Expected alert message match. Message is -  The Capital field may only contain numeric characters.");
			test.log(LogStatus.PASS,
					"Actual and Expected alert message matched. Message is -  The Capital field may only contain numeric characters.");
		} else {
			System.out.println("Actual & Expected alert message does not match. Actual Message is"
					+ con.getProperty("Capitalval1") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());
			test.log(LogStatus.PASS, "Actual & Expected alert message does not match. Actual Message is"
					+ con.getProperty("Capitalval1") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());

		}

	}

	//
	public void capAlert3() {
		if (driver.findElement(By.xpath(or.getProperty("Capitalfiledlengthaltmsg_xpath"))).getText()
				.equals(con.getProperty("Capitalval2"))) {
			System.out.println(
					"Actual & Expected alert message match. Message is The Capital field must be 100000000 or less.");
			test.log(LogStatus.PASS,
					"Actual and Expected alert message matched. Message is The Capital field must be 100000000 or less.");
		} else {
			System.out.println("Actual & Expected alert message does not match. Actual Message is" + "-"
					+ con.getProperty("Capitalval2") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());
			test.log(LogStatus.PASS, "Actual & Expected alert message does not match. Actual Message is" + "-"
					+ con.getProperty("Capitalval2") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());

		}

	}

	//

	public void startYearSelection(String SY) throws Exception {

		List<WebElement> startYear = driver.findElements(By.xpath(or.getProperty("SYGE_xpath")));

		System.out.println(startYear.size());

		for (int sy = 0; sy < startYear.size(); sy++) {

			String sys = startYear.get(sy).getText();
			System.out.println("Print the year " + sys);

			if (startYear.get(sy).getText().contains(SY)) {
				Thread.sleep(1000);
				startYear.get(sy).click();
				System.out.println("Start Year selected");
				break;
			}

		}

	}

	public void startMonthSelection(String SM) {

		List<WebElement> startMonth = driver.findElements(By.xpath(or.getProperty("SMGE_xpath")));
		System.out.println(startMonth.size());

		for (int sm = 0; sm < startMonth.size(); sm++) {
			if (startMonth.get(sm).getText().contains(SM)) {
				String sms = startMonth.get(sm).getText();

				System.out.print("--" + sms + "--");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				startMonth.get(sm).click();

				break;
			}

		}
	}

	public void startDaySelection(String SD) {
		List<WebElement> startDay = driver.findElements(By.xpath(or.getProperty("SDGE_xpath")));

		for (int sd = 0; sd < startDay.size(); sd++) {
			System.out.println(startDay.get(sd).getText());

			if (startDay.get(sd).getText().contains(SD)) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				String sds = startDay.get(sd).getText();
				System.out.println("--" + sds + "--");
				startDay.get(sd).click();

				break;
			}

		}

	}

	public void endYearSelection(String ED) throws Exception {

		List<WebElement> endYear = driver.findElements(By.xpath(or.getProperty("EYDGE_xpath")));

		System.out.println(endYear.size());

		for (int ey = 0; ey < endYear.size(); ey++) {

			String eys = endYear.get(ey).getText();
			System.out.println(eys);
			if (endYear.get(ey).getText().contains(ED)) {
				Thread.sleep(1000);
				endYear.get(ey).click();
				System.out.println("Clicked on the element");
				break;
			}

		}

	}

	public void endMonthSelection(String EM) {

		List<WebElement> endMonth = driver.findElements(By.xpath(or.getProperty("EMMS_xpath")));

		System.out.println(endMonth.size());

		for (int em = 0; em < endMonth.size(); em++) {

			String ems = endMonth.get(em).getText();

			System.out.println("---" + ems + "---");

			if (endMonth.get(em).getText().contains(EM)) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				endMonth.get(em).click();

				break;
			}

		}
	}

	public void endDaySelection(String ED) {
		List<WebElement> endDay = driver.findElements(By.xpath(or.getProperty("EDGE_xpath")));

		System.out.println(endDay.size());
		for (int ed = 0; ed < endDay.size(); ed++) {
			System.out.println(endDay.get(ed).getText());

			if (endDay.get(ed).getText().contains(ED)) {
				endDay.get(ed).click();

				break;
			}

		}

	}

	public void getElementFromTable() {

		List<WebElement> li = driver.findElements(By.xpath(or.getProperty("row1_xpath")));
		List<WebElement> l = driver.findElements(By.xpath(or.getProperty("row2_xpath")));

		System.out.println("BackTest Dashboard Status");

		for (int i = 1; i < li.size(); i++) {
			for (int j = 1; j < l.size(); j++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				System.out.println(li.get(i).getText() + "----" + l.get(i).getText());

				break;

			}
		}

	}

	public void quickYearSelection(String qys) throws Exception {

		driver.findElement(By.xpath(or.getProperty("quickStartYearOuter_xpath")));
		List<WebElement> syo = driver.findElements(By.xpath(or.getProperty("quickStartYearlist_xpath")));
		System.out.println(syo);
		for (int qy = 0; qy < syo.size(); qy++) {

			if (syo.get(qy).getText().contains(qys)) {
				Thread.sleep(1000);
				syo.get(qy).click();
				break;

			}

		}

	}

	public void quickMonthSelection(String qms) throws Exception {

		driver.findElement(By.xpath(or.getProperty("quickStartYearMonth_xpath")));
		List<WebElement> qmsl = driver.findElements(By.xpath(or.getProperty("quickStartYearMonthlist_xpath")));

		for (int qm = 0; qm < qmsl.size(); qm++) {

			if (qmsl.get(qm).getText().contains(qms)) {
				Thread.sleep(1000);
				qmsl.get(qm).click();
				break;
			}

		}
	}

	public void quickDaySelection(String qds) throws Exception {

		driver.findElement(By.xpath(or.getProperty("quickStartYearDateOuter_xpath")));
		List<WebElement> qdsl = driver.findElements(By.xpath(or.getProperty("quickStartYearDatelist_xpath")));

		for (int qd = 0; qd < qdsl.size(); qd++) {

			if (qdsl.get(qd).getText().contains(qds)) {
				Thread.sleep(1000);
				qdsl.get(qd).click();
				break;
			}

		}

	}

	public void quickYearEndSelection(String qys) throws Exception {

		driver.findElement(By.xpath(or.getProperty("quickEndYearOuter_xpath")));
		List<WebElement> qysl = driver.findElements(By.xpath(or.getProperty("quickEndYearlist_xpath")));
		System.out.println(qysl);
		for (int ql = 0; ql < qysl.size(); ql++) {

			if (qysl.get(ql).getText().contains(qys)) {
				System.out.println(qysl.get(ql).getText());

				qysl.get(ql).click();
				break;
			}
		}
	}

	public void quickEndMonthSelection(String qnms) throws Exception {

		driver.findElement(By.xpath(or.getProperty("quickEndYearMonth_xpath")));
		List<WebElement> qnmsl = driver.findElements(By.xpath(or.getProperty("quickEndYearMonthlist_xpath")));
		System.out.println(qnmsl);

		for (int qe = 0; qe < qnmsl.size(); qe++) {
			System.out.println(qnmsl);
			if (qnmsl.get(qe).getText().contains(qnms)) {

				qnmsl.get(qe).click();
				break;
			}
		}
	}

	public void quickEndDaySelection(String qeds) throws Exception {
		driver.findElement(By.xpath(or.getProperty("quickEndYearDateOuter_xpath")));
		List<WebElement> qedsl = driver.findElements(By.xpath(or.getProperty("quickEndYearDatelist_xpath")));
		System.out.println(qedsl);

		for (int qdd = 0; qdd < qedsl.size(); qdd++) {

			if (qedsl.get(qdd).getText().contains(qeds)) {

				qedsl.get(qdd).click();
				break;
			}
		}
	}

	public void startYearSelection1(String SY1) throws Exception {

		List<WebElement> startYear1 = driver.findElements(By.xpath(or.getProperty("newbackteststartyearcatch_xpath")));

		System.out.println(startYear1.size());

		for (int sy1 = 0; sy1 < startYear1.size(); sy1++) {

			String sys1 = startYear1.get(sy1).getText();
			System.out.println("Print the year " + sys1);

			if (startYear1.get(sy1).getText().contains(SY1)) {
				Thread.sleep(1000);
				startYear1.get(sy1).click();
				System.out.println("Start Year selected");
				break;
			}

		}

	}

	public void startMonthSelection1(String SM1) {

		List<WebElement> startMonth1 = driver
				.findElements(By.xpath(or.getProperty("newbackteststartmonthcatch_xpath")));
		System.out.println(startMonth1.size());

		for (int sm1 = 0; sm1 < startMonth1.size(); sm1++) {
			if (startMonth1.get(sm1).getText().contains(SM1)) {
				String mm = startMonth1.get(sm1).getText();

				System.out.print("--" + mm + "--");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				startMonth1.get(sm1).click();

				break;
			}

		}
	}

	public void startDaySelection1(String SD1) {
		List<WebElement> startDay1 = driver.findElements(By.xpath(or.getProperty("newbackteststartdatecatch_xpath")));

		for (int sd1 = 0; sd1 < startDay1.size(); sd1++) {
			System.out.println(startDay1.get(sd1).getText());

			if (startDay1.get(sd1).getText().contains(SD1)) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				String dd = startDay1.get(sd1).getText();
				System.out.println("--" + dd + "--");
				startDay1.get(sd1).click();

				break;
			}

		}

	}

	public void endYearSelection1(String ED1) throws Exception {

		List<WebElement> endYear1 = driver.findElements(By.xpath(or.getProperty("newbacktestendyear_xpath")));

		System.out.println(endYear1.size());

		for (int ey1 = 0; ey1 < endYear1.size(); ey1++) {

			String te = endYear1.get(ey1).getText();
			System.out.println(te);
			if (endYear1.get(ey1).getText().contains(ED1)) {
				Thread.sleep(1000);
				endYear1.get(ey1).click();
				System.out.println("Clicked on the element");
				break;
			}

		}

	}

	public void endMonthSelection1(String EM1) {

		List<WebElement> endMonth1 = driver.findElements(By.xpath(or.getProperty("newbacktestendmonth_xpath")));

		System.out.println(endMonth1.size());

		for (int em1 = 0; em1 < endMonth1.size(); em1++) {

			String displayMonth = endMonth1.get(em1).getText();

			System.out.println("---" + displayMonth + "---");

			if (endMonth1.get(em1).getText().contains(EM1)) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				endMonth1.get(em1).click();

				break;
			}

		}
	}

	public void endDaySelection1(String ED1) {
		List<WebElement> endDay1 = driver.findElements(By.xpath(or.getProperty("newbacktestenddate_xpath")));

		System.out.println(endDay1.size());
		for (int ed1 = 0; ed1 < endDay1.size(); ed1++) {
			System.out.println(endDay1.get(ed1).getText());

			if (endDay1.get(ed1).getText().contains(ED1)) {
				endDay1.get(ed1).click();

				break;
			}

		}
	}

	public void option(String td1) {

		String firstxpath = ".//*[@id='app']/div[1]/div/div/div/div/div/div/section/div[2]/div/div/div[2]/div/div[3]/div/ul/li[";

		String secondxpath = "]/a";

		int option = 0;

		for (int r = 1; r <= 14; r++) {

			List<WebElement> endD = driver.findElements(By.xpath(firstxpath + r + secondxpath));
			System.out.println(endD.size());
			for (int o1 = 0; o1 < endD.size(); o1++) {
				System.out.println(endD.get(o1).getText());

				if (endD.get(o1).getText().contains(td1)) {
					endD.get(o1).click();

					break;
				}

			}

		}

	}

	public void backtestnamecomapare() {

		String p1 = driver.findElement(By.xpath(or.getProperty("backtestname_xpath"))).getText();
		String p2 = driver.findElement(By.xpath(or.getProperty("modalbacktestname_xpath"))).getText();

		if (p1.equals(p2)) {
			System.out.println("Backtest name matched with modal backtest name");
			test.log(LogStatus.PASS, "Backtest name matched with modal backtest name");
		} else {
			System.out.println("Backtest name not matched with modal backtest name");
			test.log(LogStatus.PASS, "Backtest name not matched with modal backtest name");
		}

	}

	public void backtestnamecomapare1() {

		String k1 = driver.findElement(By.xpath(or.getProperty("backtestsharpe_xapth"))).getText();
		String k2 = driver.findElement(By.xpath(or.getProperty("modalbacktestsharpe_xapth"))).getText();

		if (k1.equals(k2)) {
			System.out.println("Backtest sharpe ratio  matched with modal backtest sharpe ratio");
			test.log(LogStatus.PASS, "Backtest sharpe ratio  matched with modal backtest sharpe ratio");
		} else {
			System.out.println("Backtest sharpe ratio not matched with modal backtest sharpe ratio");
			test.log(LogStatus.PASS, "Backtest sharpe ratio not matched with modal backtest sharpe ratio");
		}

	}

	public void backtestnamecomapare2() {

		String h1 = driver.findElement(By.xpath(or.getProperty("backtestcumulative"))).getText();
		String h2 = driver.findElement(By.xpath(or.getProperty("modalbacktestcumulative"))).getText();

		if (h1.equals(h2)) {
			System.out.println("Backtest Cumulative Returns matched with modal backtest Cumulative Returns");
			test.log(LogStatus.PASS, "Backtest Cumulative Returns matched with modal backtest Cumulative Returns");
		} else {
			System.out.println("Backtest Cumulative Returns not matched with modal backtest Cumulative Returns");
			test.log(LogStatus.PASS, "Backtest Cumulative Returns not matched with modal backtest Cumulative Returns");
		}

	}

	public void backtestnamecomapare4() {

		String j1 = driver.findElement(By.xpath(or.getProperty("backtestname1_xpath"))).getText();
		String j2 = driver.findElement(By.xpath(or.getProperty("modalbacktestname1_xpath"))).getText();

		if (j1.equals(j2)) {
			System.out.println("Second Backtest name matched with modal backtest name");
			test.log(LogStatus.PASS, "Second Backtest name matched with modal backtest name");
		} else {
			System.out.println("Second Backtest name matched with modal backtest name");
			test.log(LogStatus.PASS, "Second Backtest name matched with modal backtest name");
		}

	}

	public void backtestnamecomapare5() {

		String u1 = driver.findElement(By.xpath(or.getProperty("backtestsharpe1_xapth"))).getText();
		String u2 = driver.findElement(By.xpath(or.getProperty("modalbacktestsharpe1_xapth"))).getText();

		if (u1.equals(u2)) {
			System.out.println("Second Backtest sharpe ratio  matched with modal backtest sharpe ratio");
			test.log(LogStatus.PASS, "Second Backtest sharpe ratio  matched with modal backtest sharpe ratio");
		} else {
			System.out.println("Second Backtest sharpe ratio  not matched with modal backtest sharpe ratio");
			test.log(LogStatus.PASS, "Second Backtest sharpe ratio not matched with modal backtest sharpe ratio");
		}

	}

	public void backtestnamecomapare6() {

		String r1 = driver.findElement(By.xpath(or.getProperty("backtestcumulative1_xpath"))).getText();
		String r2 = driver.findElement(By.xpath(or.getProperty("modalbacktestcumulative1_xpath"))).getText();

		if (r1.equals(r2)) {
			System.out.println("Second Backtest Cumulative Returns matched with modal backtest Cumulative Returns");
			test.log(LogStatus.PASS,
					"Second Backtest Cumulative Returns matched with modal backtest Cumulative Returns");
		} else {
			System.out.println("Second Backtest Cumulative Returns not matched with modal backtest Cumulative Returns");
			test.log(LogStatus.PASS,
					"Second Backtest Cumulative Returns not matched with modal backtest Cumulative Returns");
		}

	}

	public void removebacktestStrategy() throws Exception {

		driver.findElement(By.xpath(or.getProperty("backtestdelete_xpath"))).click();
		// log.debug("Clicked on delete button");
		// test.log(LogStatus.PASS, "Delete Button Test Case Pass");
		// System.out.println("Clicked on delete button");

		WebElement e = driver.findElement(By.xpath(or.getProperty("modal_xpath")));

		// log.debug("Opened modal popup window");
		// test.log(LogStatus.PASS, "Pop Up Modal Test Case Pass");
		// System.out.println("Opned modal popup window");

		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath(or.getProperty("delete_xpath")));
		//
		// log.debug("Modal open");
		// test.log(LogStatus.PASS, "Open Modal Window Test Case Pass");
		// System.out.println("Open Modal Window Test Case Pass");

		Thread.sleep(2000);
		e1.click();
		// log.debug("Clicked on delete button");
		// test.log(LogStatus.PASS, "Delete Button Test Case Pass");
		// System.out.println("Clicked on delete button");

		System.out.println("**************************************************");
	}

	public void removeStrategy() throws Exception {

		driver.findElement(By.xpath(or.getProperty("deletebtn_xpath"))).click();
		// log.debug("Clicked on BactTest link");
		// test.log(LogStatus.PASS, "Back Test Link Test Case Pass");
		// System.out.println("Clicked on BactTest link");

		WebElement e = driver.findElement(By.xpath(or.getProperty("modal_xpath")));

		// log.debug("Opened modal popup window");
		// test.log(LogStatus.PASS, "Pop Up Modal Test Case Pass");
		// System.out.println("Opned modal popup window");

		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath(or.getProperty("delete_xpath")));

		// log.debug("Modal open");
		// test.log(LogStatus.PASS, "Open Modal Window Test Case Pass");
		// System.out.println("Open Modal Window Test Case Pass");

		Thread.sleep(2000);
		e1.click();
		// log.debug("Clicked on delete button");
		// test.log(LogStatus.PASS, "Delete Button Test Case Pass");
		// System.out.println("Clicked on delete button");

		System.out.println("**************************************************");
	}

	public void nobacktestPresentOnPageValidation() {

		if (driver.findElement(By.xpath(or.getProperty("nobacktestpagemsg_xpath")))
				.equals(con.get("nobacktestpresent"))) {
			System.out.println("All back test has been deleted");
			test.log(LogStatus.PASS, "All back test has been deleted");
		} else {
			System.out.println("All back tests has have not been deleted");
			test.log(LogStatus.PASS, "All back tests have not been deleted");
		}

	}

	public void nostrategyPresentOnPageValidation() {

		if (driver.findElement(By.xpath(or.getProperty("nostrategypagemsg_xpath")))
				.equals(con.get("nostrategypresent"))) {
			System.out.println("All Strategies have been deleted");
			test.log(LogStatus.PASS, "All Strategies have been deleted");
		} else {
			System.out.println("All Strategies have not been deleted");
			test.log(LogStatus.PASS, "All Strategies have not been deleted");
		}

	}
	/// Quick

	public void quickdatasetAlert() {

		if (driver.findElement(By.xpath(or.getProperty("quickdatasetalrtmsg_xpath"))).getText()
				.equals(con.getProperty("Dataset"))) {
			System.out.println("Actual Dataset alert message and Expected Dataset message matched");
			test.log(LogStatus.PASS, "Actual Dataset alert message and Expected Dataset message matched");
		} else {
			System.out.println("Actual Dataset alert message and Expected Dataset message not matched");
			test.log(LogStatus.PASS, "Actual Dataset alert message and Expected Dataset message not matched");
		}

	}
	//

	public void quickstartdateAlert() {

		if (driver.findElement(By.xpath(or.getProperty("quickstartdatealrtmsg_xpath"))).getText()
				.equals(con.getProperty("StartDate"))) {
			System.out.println("Actual Start Date alert message and Expected Start Date message matched");
			test.log(LogStatus.PASS, "Actual Start Date alert message and Expected Start Date message matched");
		} else {
			System.out.println("Actual Start Date alert message and Expected Start Date message not matched");
			test.log(LogStatus.PASS, "Actual Start Date alert message and Expected Start Date message not matched");
		}

	}

	//

	public void quickenddateAlert() {

		if (driver.findElement(By.xpath(or.getProperty("quickenddatealertmsg_xpath"))).getText()
				.equals(con.getProperty("EndDate"))) {
			System.out.println("Actual EndDate alert message and Expected End Date message matched");
			test.log(LogStatus.PASS, "Actual EndDate alert message and Expected End Date message matched");
		} else {
			System.out.println("Actual EndDate alert message and Expected End Date message not matched");
			test.log(LogStatus.PASS, "Actual EndDate alert message and Expected End Date message not matched");
		}

	}
	//

	public void quickcapAlert1() {

		if (driver.findElement(By.xpath(or.getProperty("quickCapitalfielddigitvalaltmsg_xpath"))).getText()
				.equals(con.getProperty("Capitalval"))) {
			System.out.println(
					"Actual & Expected alert message is matched. Message is - The Capital field must be 1 or more.");
			test.log(LogStatus.PASS,
					"Actual & Expected alert message is matched. Message is - The Capital field must be 1 or more.");
		} else {

			System.out.println("Actual & Expected alert message does not match. Actual Message is" + "-"
					+ con.getProperty("Capitalval") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());
			test.log(LogStatus.PASS, "Actual & Expected alert message does not match. Actual Message is" + "-"
					+ con.getProperty("Capitalval") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());

		}

	}

	//
	public void quickcapAlert2() {

		if (driver.findElement(By.xpath(or.getProperty("quickCapitalfieldcharaltmsg_xpath"))).getText()
				.equals(con.getProperty("Capitalval1"))) {
			System.out.println(
					"Actual & Expected alert message match. Message is -  The Capital field may only contain numeric characters.");
			test.log(LogStatus.PASS,
					"Actual and Expected alert message matched. Message is -  The Capital field may only contain numeric characters.");
		} else {
			System.out.println("Actual & Expected alert message does not match. Actual Message is"
					+ con.getProperty("Capitalval1") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());
			test.log(LogStatus.PASS, "Actual & Expected alert message does not match. Actual Message is"
					+ con.getProperty("Capitalval1") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());

		}

	}

	//
	public void quickcapAlert3() {
		if (driver.findElement(By.xpath(or.getProperty("quickCapitalfiledlengthaltmsg_xpath"))).getText()
				.equals(con.getProperty("Capitalval2"))) {
			System.out.println(
					"Actual & Expected alert message match. Message is The Capital field must be 100000000 or less.");
			test.log(LogStatus.PASS,
					"Actual and Expected alert message matched. Message is The Capital field must be 100000000 or less.");
		} else {
			System.out.println("Actual & Expected alert message does not match. Actual Message is" + "-"
					+ con.getProperty("Capitalval2") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());
			test.log(LogStatus.PASS, "Actual & Expected alert message does not match. Actual Message is" + "-"
					+ con.getProperty("Capitalval2") + " " + "but found "
					+ driver.findElement(By.xpath(
							".//*[@id='app']/div[1]/div/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/ul/li/span"))
							.getText());

		}

	}

	public void com() throws IOException {
		BufferedReader reader1 = new BufferedReader(new FileReader("/home/academy/Desktop/tt.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("/home/academy/Desktop/Ex.txt"));

		// BufferedReader reader1 = new BufferedReader(new
		// FileReader(System.getProperty("user.dir") +
		// "/src/test/resources/Algorithm/Algorithm.txt"));

		// BufferedReader reader2 = new BufferedReader(new
		// FileReader(System.getProperty("user.dir") +
		// "/src/test/resources/Algorithm/SMA Pipeline (All).txt"));

		String line1 = reader1.readLine();

		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null) {
			if (line1 == null || line2 == null) {
				areEqual = false;

				break;
			} else if (!line1.equalsIgnoreCase(line2)) {
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}

		if (areEqual) {
			System.out.println("Two files have same content.");
			test.log(LogStatus.PASS, "Actual & Expected algorithm have been matched.");
		} else {
			System.out.println("Actual & Expected algorithm  have different content. They differ at line " + lineNum);
			test.log(LogStatus.FAIL, "Actual & Expected algorithm  have different content. They differ at line "
					+ lineNum + ". Actual algorithm text is :" + line1 + " , at line number " + line2 + lineNum + ".");

			System.out.println(
					"Actual algorithm has " + line1 + " and Expected algorithm has : " + line2 + " at line " + lineNum);
			// test.log(LogStatus.FAIL,
			// "Actual algorithm has " + line1 + " and Expected algorithm has " + line2 + "
			// at line " + lineNum);
		}

		reader1.close();

		reader2.close();
	}

	public void quickAssert() {

		String ActualReturns = driver.findElement(By.xpath(or.getProperty("QuickActualreturn_xpath"))).getText();
		if (ActualReturns.equals(con.getProperty("QRETURNS"))) {
			System.out.println("Actual & Expected RETURN match");
			test.log(LogStatus.PASS, "Actual & Expected RETURN match");
		} else {
			System.out.println("Actual & Expected RETURN not match");
			test.log(LogStatus.PASS, "Actual & Expected RETURN not match");
		}

		String ActualAlpha = driver.findElement(By.xpath(or.getProperty("QuickrunActualAlpha_xpath"))).getText();
		if (ActualAlpha.equals(con.getProperty("QALPHA"))) {
			System.out.println("Actual & Expected ALPHA match");
			test.log(LogStatus.PASS, "Actual & Expected ALPHA match");
		} else {
			System.out.println("Actual & Expected ALPHA not match");
			test.log(LogStatus.PASS, "Actual & Expected ALPHA not match");
		}
		String ActualBeta = driver.findElement(By.xpath(or.getProperty("QuickrunActualBeta_xpath"))).getText();
		if (ActualBeta.equals(con.getProperty("QBETA"))) {
			System.out.println("Actual & Expected BETA match");
			test.log(LogStatus.PASS, "Actual & Expected BETA match");
		} else {
			System.out.println("Actual & Expected BETA not match");
			test.log(LogStatus.PASS, "Actual & Expected BETA not match");
		}

		String ActualSharpe = driver.findElement(By.xpath(or.getProperty("QuickrunActualSharpe_xpath"))).getText();
		if (ActualSharpe.equals(con.getProperty("QSHARPE"))) {
			System.out.println("Actual & Expected SHARPE match");
			test.log(LogStatus.PASS, "Actual & Expected SHARPE match");
		} else {
			System.out.println("Actual & Expected SHARPE not match");
			test.log(LogStatus.PASS, "Actual & Expected SHARPE not match");
		}

		String ActualDrawdown = driver.findElement(By.xpath(or.getProperty("QuickrunActualDrawdown_xpath"))).getText();
		if (ActualDrawdown.equals(con.getProperty("QDRAWDOWN"))) {
			System.out.println("Actual & Expected DRWADOWN match");
			test.log(LogStatus.PASS, "Actual & Expected DRWADOWN match");
		} else {
			System.out.println("Actual & Expected DRWADOWN not match");
			test.log(LogStatus.PASS, "Actual & Expected DRWADOWN not match");
		}
	}

	public void quickTime() {
		long startTime = System.currentTimeMillis();

		boolean loadder = driver.findElement(By.xpath(or.getProperty("quickloder_xpath"))).isDisplayed();

		System.out.println(loadder);

		System.out.println("Start Time is " + startTime);

		new WebDriverWait(driver, 60).until(ExpectedConditions.

				presenceOfElementLocated(By.xpath(or.getProperty("quickloder_xpath"))));

		long endTime = System.currentTimeMillis();
		System.out.println("End Time is " + endTime);

		long totalTime = endTime - startTime;

		System.out.println("Total Load Time for graph is : " + totalTime + " milliseconds");
		test.log(LogStatus.INFO, "Total Load Time for graph is : " + totalTime + " milliseconds");

		wait(60);

	}

	public void quickAlertMessages() {

		String algocodetitle = con.getProperty("AlgoTitleforSMAPipelineAll");

		if (driver.findElement(By.xpath(".//*[@id='algo-code-editor']/form/div/div/div/div")).getText()
				.contains(algocodetitle)) {
			System.out.println("Algo editor title is :- " + con.getProperty("AlgoTitleforSMAPipelineAll")
					+ " , and matched with strategy template title");
			test.log(LogStatus.PASS, "Algo editor title is :- " + con.getProperty("AlgoTitleforSMAPipelineAll")
					+ " , and matched with strategy template title");
		} else {
			System.out.println("Algo editor title is :- " + con.getProperty("AlgoTitleforSMAPipelineAll")
					+ " , and does not match with strategy template title");
			test.log(LogStatus.PASS, "Algo editor title is :- " + con.getProperty("AlgoTitleforSMAPipelineAll")
					+ " , and does not match with strategy template title");
		}

		String algocodedataset = con.getProperty("AlgoDatasetTitleforSMAPipelineAll");
		if (driver.findElement(By.xpath(".//*[@id='algo-code-editor']/form/div/div/div/div")).getText()
				.contains(algocodedataset)) {
			System.out.println("Algo editor dataset title is :- " + con.getProperty("AlgoDatasetTitleforSMAPipelineAll")
					+ " , and match with actual dataset title");
			test.log(LogStatus.PASS, "Algo editor dataset title is :- "
					+ con.getProperty("AlgoDatasetTitleforSMAPipelineAll") + " , and match with actual dataset title");
		} else {
			System.out.println("Algo editor dataset title is :- " + con.getProperty("AlgoDatasetTitleforSMAPipelineAll")
					+ " , and does not match with actual dataset title");
			test.log(LogStatus.PASS,
					"Algo editor dataset title is :- " + con.getProperty("AlgoDatasetTitleforSMAPipelineAll")
							+ " , and does not match with actual dataset title");
		}
	}

	public String gText(String locator) {

		String text = null;

		if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(or.getProperty(locator))).getText();
		} else if (locator.endsWith("_css")) {
			driver.findElement(By.cssSelector(or.getProperty(locator))).getText();
		} else if (locator.endsWith("_id")) {
			driver.findElement(By.id(or.getProperty(locator))).getText();
		} else if (locator.endsWith("_linkText")) {
			driver.findElement(By.linkText(or.getProperty(locator))).getText();
		} else if (locator.endsWith("_partialLinkText")) {
			driver.findElement(By.partialLinkText(or.getProperty(locator))).getText();
		}
		return locator;

	}

}
