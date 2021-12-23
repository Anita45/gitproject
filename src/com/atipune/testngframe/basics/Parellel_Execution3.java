package com.atipune.testngframe.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parellel_Execution3
{
	@Test
	public void m6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation testing\\files\\chromedriver.exe\\");
		WebDriver d= new ChromeDriver();
		d.get("https://physicspadhai.blogspot.com/");
	}
}
