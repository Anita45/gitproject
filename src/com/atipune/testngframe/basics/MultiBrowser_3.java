package com.atipune.testngframe.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_3 

{
	
	@Parameters("browser")
    @Test
   public void multibrowesr( String browser)
   {
		
		WebDriver d=null;
	   
	  if(browser.equals("chrome")) 
	  {
		  
		  System.setProperty("webdriver.chrome.driver","E:\\Automation testing\\files\\chromedriver.exe\\");
		  d=new ChromeDriver();
		  
	  } 
	  else if(browser.equals("firefox"))
	  {
		  
		  
		  System.setProperty("webdriver.gecko.driver","E:\\Automation testing\\files\\geckodriver.exe\\");
		  d=new FirefoxDriver();
		  
	  }
	  
	  d.get("https://www.google.co.in/");
	  d.manage().window().maximize();
	  d.close();
	   
   }
}
