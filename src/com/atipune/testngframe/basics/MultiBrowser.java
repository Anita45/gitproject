package com.atipune.testngframe.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser
{
	@Parameters("browsername")
	@Test
   public void test(String  browsername)
   {
		
		WebDriver d=null;
	 if(browsername.equals("chrome")) { 
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation testing\\files\\chromedriver.exe\\");
	   d = new ChromeDriver();
	  // d.get("https://physicspadhai.blogspot.com/");
	 }

   
	 else if (browsername.equals("Firefox"))
	 {
  
	   System.setProperty("webdriver.gecko.driver", "E:\\Automation testing\\files\\geckodriver.exe\\");
	   d=new FirefoxDriver();
	  // d.get("https://www.amazon.in/");
	   
	   
   }
	 else if(browsername.equals("edge"))
	 {
		System.setProperty("webdriver.edge.driver","E:\\Automation testing\\files\\msedgedriver.exe\\");
		 
	 }
   
   
      d.get("https://physicspadhai.blogspot.com/"); 
      d.manage().window().maximize();
      d.close();
      
   
   
   
   
   
   }
}
