package com.atipune.testngframe.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parellel_Execution 
{
@Test
public void m1()
{

	System.setProperty("webdriver.chrome.driver", "E:\\Automation testing\\files\\chromedriver.exe\\");
	WebDriver d= new ChromeDriver();
	d.get("https://demoqa.com/alerts");
}
	
}

