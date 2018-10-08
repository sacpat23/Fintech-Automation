package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.qa.utility.ExcelReader;
import com.qa.utility.ExtentManager;
import com.qa.utility.TestUtils;
//import com.qa.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import com.qa.custom.CustomeMethods;

public class BaseTest {

	public static WebDriver driver;
	public static Properties con = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "/src/test/resources/DataExcel/File.xlsx");
	public static CustomeMethods cm = new CustomeMethods();

	public static WebDriverWait wait;

	@BeforeSuite
	public void setUp() {

		if (driver == null) {

			try {

				fis = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/propertyFile/Config.properties");
				con.load(fis);
				log.debug("Config file loaded");

			} catch (IOException e) {
				e.printStackTrace();
			}

			try {

				fis = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/propertyFile/OR.properties");
				or.load(fis);

				log.debug("test");
				log.debug("OR file loaded");
			} catch (IOException e) {

				e.printStackTrace();
			}

			if (con.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/home/academy/Desktop/Drivers/chromedriver");
				driver = new ChromeDriver();
				log.debug("Chrome Launched");

			} else if (System.getProperty("browser").equals("Firefox")) {
				driver = new FirefoxDriver();
			}

			driver.manage().window().maximize();
			log.debug("Window maximize");
			driver.manage().deleteAllCookies();

			// TestUtil.captureScreenShot(driver, "Window maximize");
			driver.get(con.getProperty("url"));
			log.debug("Enter Url");

			driver.manage().timeouts().implicitlyWait(Integer.parseInt(con.getProperty("implicitwait")),
					TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 3);

		}
	}

	public boolean isElementIsPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void click(String locator) {

		if (locator.endsWith("_css")) {
			driver.findElement(By.cssSelector(or.getProperty(locator))).click();
		} else if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(or.getProperty(locator))).click();
		} else if (locator.endsWith("_id")) {
			driver.findElement(By.id(or.getProperty(locator))).click();

		}

	}

	public void type(String locator, String value) {

		if (locator.endsWith("_css")) {
			driver.findElement(By.cssSelector(or.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(or.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_id")) {
			driver.findElement(By.id(or.getProperty(locator))).sendKeys(value);
		}

		// test.log(LogStatus.INFO, "Typing in : " + locator + " entered value as " +
		// value);

	}

	public void clear(String locator) {

		if (locator.endsWith("_css")) {
			driver.findElement(By.cssSelector(or.getProperty(locator))).clear();
		} else if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(or.getProperty(locator))).clear();
		} else if (locator.endsWith("_id")) {
			driver.findElement(By.id(or.getProperty(locator))).clear();

		}
		// test.log(LogStatus.INFO, "Clicking on : " + locator);

	}

	public void element(String locator) {

		if (locator.endsWith("_css")) {
			driver.findElement(By.cssSelector(or.getProperty(locator)));
		} else if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(or.getProperty(locator)));
		} else if (locator.endsWith("_id")) {
			driver.findElement(By.id(or.getProperty(locator)));

		}

	}

	public WebElement getElement(String locator) {

		WebElement e = null;

		if (locator.endsWith("_css")) {
			driver.findElement(By.cssSelector(or.getProperty(locator)));
		} else if (locator.endsWith("_xpath")) {
			driver.findElement(By.xpath(or.getProperty(locator)));
		} else if (locator.endsWith("_id")) {
			driver.findElement(By.id(or.getProperty(locator)));

		}

		return e;

	}

	public void wait(int timeToWaitInSec) {
		try {
			Thread.sleep(timeToWaitInSec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String gText(String locator) {

		String t = null;

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

	public void takeScreenShot() {

		Date d = new Date();
		String screenShotFile = d.toString().replaceAll(";", " ").replace(" ", "_") + ".png";

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcFile,
					new File(System.getProperty("user.dir") + "src/test/resources/screenshot" + screenShotFile));
		} catch (IOException e) {

			e.printStackTrace();
		}
		test.log(LogStatus.INFO, "Screenshot" + test
				.addScreenCapture(System.getProperty("user.dir") + "src/test/resources/screenshot" + screenShotFile));

	}

	@AfterSuite

	public void closeBrowser() {

		if (driver != null)

		{
			driver.close();
		}
	}
}