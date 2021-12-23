package com.atipune.testngframe.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert_method
{
public void  openBrowser() 
{
	
	
   System.setProperty("webdriver.cgrome.driver","E:\\Automation testing\\files\\chromedriver.exe\\");
   WebDriver d=new ChromeDriver();
   d.get("https://www.flipkart.com/");
   d.manage().window().maximize();
}


public void  verifyingHomePage()
{
  
	

}
}
