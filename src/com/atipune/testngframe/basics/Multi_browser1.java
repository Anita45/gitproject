package com.atipune.testngframe.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_browser1 
{

	
	@Parameters("browser_name")
	@Test
	public  void multi_broswer1( String browser_name) 
	{
		
		WebDriver d=null;
		
		if(browser_name.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","E:\\Automation testing\\files\\chromedriver.exe\\");
			d=new ChromeDriver();
			
			
		}
		else if(browser_name.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "E:\\Automation testing\\files\\geckodriver.exe\\");
			d=new FirefoxDriver();
			
			
			
		}
		
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		d.close();
		
	}
}
