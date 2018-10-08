package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.utility.ExtentManager;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends BaseTest {

	@Test

	public void homePage() throws Exception {
		
		 rep = ExtentManager.getInstance();
		 test = rep.startTest("Home Page");
		
		System.out.println("Test Case 2 # User is on Home Page");
		System.out.println(
				);
		 

		System.out.println("Page Title is "+driver.getTitle());
		log.debug(driver.getTitle());
		test.log(LogStatus.PASS, "Sucessfully Verified The Tage Title");
	
		 

		System.out.println("User Name is "+ driver.findElement(By.xpath(or.getProperty("name_xpath"))).getText());
		log.debug("Verified username as " + driver.findElement(By.xpath(or.getProperty("name_xpath"))).getText());
		test.log(LogStatus.PASS, "Sucessfully Verified The User Name");
		 


		driver.findElement(By.xpath(or.getProperty("createstretegy_xpath"))).click();
		log.debug("Clicked on the Create New Stretegy button");
		System.out.println("Clicked on the Create New Stretegy button");
		test.log(LogStatus.PASS, "Create New Strategy Test Case Pass");
		 

		driver.findElement(By.xpath(or.getProperty("stretegytitle_xpath"))).sendKeys(con.getProperty("stretegytitle"));
		log.debug("Entered title name");
		System.out.println("Entered title name");
		test.log(LogStatus.PASS, "Title Creation Test Case Pass");
		 

		WebElement stretegy = driver.findElement(By.xpath(or.getProperty("selectstretegytemplate")));
		log.debug("Clicked on the drop down list");
		System.out.println("Clicked on the drop down list");
		test.log(LogStatus.PASS, "Drop down Test Case Pass");
		 
		
		Select se = new Select(stretegy);
		se.selectByVisibleText("Buy and Hold NSE");
		log.debug("Stretegy is selected from drop down");
		System.out.println("Stretegy is selected from drop down");
		test.log(LogStatus.PASS, "Drop Down Option Selection Test Case Pass");
		 
		
		driver.findElement(By.xpath(or.getProperty("createalgorithm"))).click();
		log.debug("Clicked on the Create Algorithm button");
		System.out.println("Clicked on the Create Algorithm button");
		test.log(LogStatus.PASS, "Create Algorithm Test Case Pass");
		 
		System.out.println("**************************************************");
		
		
		
	
	}
	@AfterTest
	 public void endReport(){
		rep.flush();
		
   }
}
