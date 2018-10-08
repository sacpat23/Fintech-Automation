package com.qa.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends BaseTest {

	@Test

	public void loginPage() {
		rep = ExtentManager.getInstance();
		test = rep.startTest("Login Page");

		System.out.println("Test Case 1 #  User is on Login Page ");
		System.out.println();

		type("email_xpath", con.getProperty("email"));
		System.out.println("Entered the email address");
		log.debug("Entered the email address");
		test.log(LogStatus.INFO, "Email Address Test Case Pass");

		type("pwd_xpath", con.getProperty("pwd"));
		System.out.println("Entered the password");
		log.debug("Entered the password");
		test.log(LogStatus.PASS, "Password Test Case Pass");

		click("loginbtn_xpath");
		Assert.assertTrue(isElementIsPresent(By.xpath(or.getProperty("loginbtn_xpath"))), "Login not successful");
		System.out.println("Clicked on the login button");
		log.debug("Clicked on the login button");
		test.log(LogStatus.PASS, "Login Button Test Case Pass");
		takeScreenShot();
		System.out.println("**************************************************");

	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
