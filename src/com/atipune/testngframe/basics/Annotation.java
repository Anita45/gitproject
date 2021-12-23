package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation

{
	@BeforeClass
	public void openbrowser() 
	{
		Reporter.log("opernbowrser....",true);
		
	}
	
	
	@BeforeMethod
	public  void logintoapp()
	{
		Reporter.log("login to app....", true);
	}
	
	
	@Test
public void verifypn()
{
	Reporter.log("running verify pn test script",true);
}
	
	@Test
public void verifyUserid()
{
	Reporter.log("running verify ID test script",true);
}
	
	@AfterMethod
	public  void loginout()
	{
		Reporter.log("logout to app....", true);
	}
	
	@AfterClass
	public  void closebrowser()
	{
		Reporter.log("logout to app....", true);
	}
}
