package com.atipune.testngframe.basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
	

	
public class TestNGAssert {
	
	WebDriver driver;
	@BeforeMethod	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sep_Mrng_2021_JavaAutomation\\TestNGFramework\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyHomePageTitle() {
	  String expectedTitle="Automation Practice Site";
	  String actualTitle=driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
 	}
	
	@Test
	public void verifyNewArrivalsDisplayed() {
		boolean arrivalsActual=driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2")).isDisplayed();	
		Assert.assertTrue(arrivalsActual);
 	}
	
	@Test
	public void verifyFirstBookTitle() {
		String expectedTitleBook="Selenium Ruby";
		String actualTitleBook=driver.findElement(By.xpath("//h3[text()='Selenium Ruby']")).getText();	
		Assert.assertEquals(actualTitleBook,expectedTitleBook);
 	}
	
	//write the automation scripts for following  test cases
	//verify title of 2nd book
	//verify title of 3rd book
	//verify the price of 1st book
	//verify the price of 2st book
	//verify the price of 3st book
	//verify only 3 books are in new arrivals 
	//verify "Add to Basket" button for all three books is displayed
	//verify "Add to Basket" button for all three books is enabled
	
	
  	@AfterMethod	
	public void closeBrowser()
	{
		driver.quit();
	}
}