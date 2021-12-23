package com.atipune.testngframe.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dataprovider 
{
	
	public  void openbrowser()
	{
	System.setProperty("webdriver.chrome.driver","E:\\Automation testing\\files\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.irctc.co.in/nget/train-search");
	WebElement okButton=d.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
	if(okButton.isDisplayed()) 
	{
		okButton.click();
	}
	}
	
	

	
}

