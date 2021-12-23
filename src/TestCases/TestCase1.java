package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1
{
    WebDriver driver;
    
    @BeforeMethod
	public void openbrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation testing\\files\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
	
	}
    
  

    	@Test
    	public void verifyHomePageTitle() throws InterruptedException {
    	  String expectedTitle="Automation Practice Site";
    	  String actualTitle=driver.getTitle();
    	  Thread.sleep(3000);
    	  System.out.println(actualTitle);
    	//Assert.assertEquals(actualTitle, expectedTitle);
     	} 
    	
   
    	@Test
    	public void verifyFirstBookTitle() {
    		String expectedTitleBook="Selenium Ruby";
    		String actualTitleBook=	driver.findElement(By.xpath("//h3[text()='Selenium Ruby']")).getText();
    		Assert.assertEquals(actualTitleBook,expectedTitleBook);
     	}
   
    
    
    @AfterMethod
    public void closeMethod() 
    {
    	driver.close();
    	
    }
}
