package TestCases;
import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report_Extent_for_amazon 
{
public static ExtentHtmlReporter htmlreporter;
public static ExtentReports extent;
public static WebDriver driver;
public static ExtentTest test;
	
	@BeforeTest
	public static void setupExtent() 
	{
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/extent-report.html");
		htmlreporter.config().setDocumentTitle("AMAZON");
		htmlreporter.config().setReportName("Amazon Log In Testing");
		htmlreporter.config().setTheme(Theme.DARK);
		
	extent=new ExtentReports();
	extent.attachReporter(htmlreporter);
	extent.setSystemInfo("HOST NAME", "LOCALHOST");
	extent.setSystemInfo("Operating System", "WINDOWS 10");   //before test ===> report 
	extent.setSystemInfo("Tester NAME", "Anita yadav");   //before class==> browser
	extent.setSystemInfo("Browser", "Chrome");  
	}
	
	@BeforeClass
	public void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation testing\\files\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 2)
	public void verifyHomePageTitle() throws IOException {
		int TCID = 100;
		String expectedTitle = "Facebolog in or sign upp";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	 
		Utility.captureScreenshot(driver, TCID);
	} 

	@Test(priority = 1)
	public void verifyFacebookImgDisplayed() {
		boolean arrivalsActual = driver.findElement(By.xpath("//img[@alt='Facebook']"))
				.isDisplayed();
		Assert.assertTrue(arrivalsActual);
	}

	@Test
	public void verifyLogIn() {
		String expectedlogin = "Log In";
		String actuallogin = driver.findElement(By.xpath("//*[text()='Log In']")).getText();
		Assert.assertEquals(actuallogin, expectedlogin);
	}

	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "TEST CASE FAILED is" + result.getName()); 
			test.log(Status.FAIL, "TEST CASE FAILED is" + result.getThrowable());
			
			//Utility.captureScreenshot(driver,  TCID); 
		}
	        else if (result.getStatus() == ITestResult.SKIP)
	        {
			test.log(Status.SKIP, "TEST CASE SkIPPED:" + result.getName());
			test.log(Status.SKIP, "TEST CASE FAILED is" + result.getThrowable());
		    }
			else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "TEST CASE PASSED:" + result.getName());
		}
	
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}
	
	
	@AfterTest
	public void  cleanup()
	{
		extent.flush();
	}
		
		
		
		
	}
	
	
