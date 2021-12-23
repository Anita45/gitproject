package com.atipune.testngframe.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_browser_parellel 

{
	
	@Parameters("multi_browser")
    @Test
	public void  test1(String multi_browser) {
	WebDriver d=null;
			
  {
	  
	   if(multi_browser.equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","E:\\Automation testing\\files\\chromedriver.exe\\");
		   d=new ChromeDriver();
		   
	   }
	   
	   else if (multi_browser.equals("Firefox"))
	   {
		   
		  System.setProperty("webdriver.gecko.driver","E:\\Automation testing\\files\\geckodriver.exe\\") ;
		  d=new FirefoxDriver();
		   
		   
	   }
	   
	   d.get("https://www.google.co.in/");
	   d.close();
  }
}
}
