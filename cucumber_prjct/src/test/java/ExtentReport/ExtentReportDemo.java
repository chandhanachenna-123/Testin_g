package ExtentReport;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportDemo {
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeClass 
	public void starttest() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/spark.html");
		
	}
	@Test
	public void extenttest() {
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("ReportDemo");
		
		extent.attachReporter(spark);
		
		//create a test node in the report
		ExtentTest test = extent.createTest("Login test").assignAuthor("chandhana");
		test.pass("Login test Successful");
		test.info("url loaded");
		test.pass("login test completed successfully");
		
				
		
		//create a test node in the report
		ExtentTest test1 = extent.createTest("HomePage tets").assignAuthor("chandhana");
		test1.pass("HomePage Successful");
		test1.info("value entered");
		test1.fail("Homepage test fails");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if(driver.getTitle().equals("Google")) {
			test.log(Status.PASS,"Navigated to the specified URL");
			
		}
		else 
		{
			test.log(Status.FAIL, "Test Failed");
			
		}
		driver.quit();
			
	}
	
	@AfterMethod
	public void teardown() {
		extent.flush();
	}
	

}
