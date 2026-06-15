package utilities;

import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager implements ITestListener 
{
	// Implement methods of ITestListener to generate Extent Reports
	
	public ExtentSparkReporter extentReporter;
	public ExtentReports extentReport;
	public ExtentTest extentTest;	
	

}
