package com.qa.utility;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports extent;
/*
	public static ExtentReports getInstance() {
		
		if(extent==null) {
			Date d =new Date();
			String fileName = d.toString().replaceAll(";"," ").replace(" ", "_")+".html";
			extent = new ExtentReports(System.getProperty("user.dir")+"/src/test/resources/reports/"+fileName, true, DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"/src/test/resources/extentconfig/ReportsConfig.xml"));
			
		}
		return extent;

	}*/

	
	


	public static ExtentReports getInstance() {

		if (extent == null) {

			extent = new ExtentReports(System.getProperty("user.dir") + "/target/html/extent.html",
					true, DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(
					System.getProperty("user.dir") + "/src/test/resources/extentconfig/ReportsConfig.xml"));

		}

		return extent;

	}
}
