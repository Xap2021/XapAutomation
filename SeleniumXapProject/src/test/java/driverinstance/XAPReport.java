/*** Coded by Chirag Patel ****/
package driverinstance;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class XAPReport 
{
	public static ExtentTest test;
	public static ExtentReports extent;

	public static void reportStartUp() 
	{
		ExtentSparkReporter report = new ExtentSparkReporter("F:\\Automation\\Xap Selenium Project\\SeleniumXapProject\\Report\\Report.html");
		extent = new ExtentReports();
		extent.attachReporter(report);
	}
	public static void startUp() {
		reportStartUp();
	}

	public static void initialisation(String testName) {
		test = extent.createTest(testName);
	}

	public static void logStat(Status status, String message) {
		test.log(status, message);
	}

	public static void endTest() {
		extent.flush();
	}

	
}
