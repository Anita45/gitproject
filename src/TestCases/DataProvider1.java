package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1
{
	WebDriver d;
	WebElement    Webfirstname   ,WebMiddleNme, WebLastname;
	@BeforeMethod
	public void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation testing\\files\\chromedriver.exe\\");
		 d=new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/profile/user-registration");
		
	}
	
//	@Test(dataProvider="login-form")
	@Test
	public void loginForm()
	{
	   Webfirstname =d.findElement(By.xpath("//input[@type=\"text\"]"));
	   Webfirstname.sendKeys("avcdf");
	   
	   WebMiddleNme =d.findElement(By.xpath("//input[@id=\"middleName\"]"));
	   WebMiddleNme.sendKeys("xcgrtr");
	   
	   
	   WebLastname=d.findElement(By.xpath(""));
	   WebLastname.sendKeys("adshft");
	   
	 	   
		
	} 
//	@DataProvider(name="login-Form")
//	public Object[][] loginform()
	//{
		//return null;
		
	//}
	
	@AfterMethod
	public void closeBrowser() 
	{
		d.close();

	
}
	}
