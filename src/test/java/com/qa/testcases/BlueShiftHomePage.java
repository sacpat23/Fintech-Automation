package com.qa.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class BlueShiftHomePage extends BaseTest {

	@Test

	public void blueSfiftHomePage() throws Exception {

		rep = ExtentManager.getInstance();
		test = rep.startTest("Login Page");

		click("SignIn_xpath");

		String parent = driver.getWindowHandle();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				Thread.sleep(2000);
				type("ssouseremailid_xpath", con.getProperty("email"));
				test.log(LogStatus.PASS, "User enetered the email address");

				type("ssouserpassword_xpath", con.getProperty("pwd"));
				test.log(LogStatus.PASS, "User enetered the email password");

				click("ssosignin_xpath");
				test.log(LogStatus.PASS, "Clicked on the sign in button");
				driver.switchTo().window(parent);

			}

		}
	}

	@AfterTest
	public void endReport() {
		rep.flush();

	}

}
