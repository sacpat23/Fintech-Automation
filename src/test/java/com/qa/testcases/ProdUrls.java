package com.qa.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class ProdUrls extends BaseTest {

	@Test

	public void links() throws Exception {
		rep = ExtentManager.getInstance();
		test = rep.startTest("Prod Urls");

		if (con.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/home/academy/Downloads/Jar/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
			log.debug("Chrome Launched");
		} else if (System.getProperty("browser").equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		Thread.sleep(2000);
		driver.manage().window().maximize();

		// driver.get(con.getProperty("url"));

		String a[] = new String[12];
		a[0] = con.getProperty("testurl1");
		a[1] = con.getProperty("testurl2");
		a[2] = con.getProperty("testurl3");
		a[3] = con.getProperty("testurl4");
		a[4] = con.getProperty("testurl5");
		a[5] = con.getProperty("testurl6");
		a[6] = con.getProperty("testurl7");
		a[7] = con.getProperty("testurl8");
		a[8] = con.getProperty("testurl9");
		a[9] = con.getProperty("testurl10");
		a[10] = con.getProperty("testurl11");
		a[11] = con.getProperty("testurl12");

		for (int i = 0; i < a.length; i++) {

			Thread.sleep(3000);

			driver.get(a[i]);
			System.out.println("Url opened " + a[i]);
			test.log(LogStatus.PASS, "Production URL Test Case Pass");
		}

	}

	@AfterTest
	public void endReport() {
		rep.flush();
		driver.close();

	}

}
