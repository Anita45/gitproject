package com.atipune.testngframe.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert_Test
{
	
@BeforeMethod	
public  void openBrowser()
{
	
	System.setProperty("webdriver.chrome.driver","E:\\Automation testing\\files\\chromedriver.exe\\");
    WebDriver driver  = new  ChromeDriver();
    driver.get("https://www.facebook.com//");
}



@Test
public  void verifyhomepage()
{
String Expected="hello";
String Expected1="hiii";
Assert.assertEquals(Expected,  Expected1);


}
@AfterMethod	
public  void closeBrowser()
{
	Reporter.log("close");
	
}



}
