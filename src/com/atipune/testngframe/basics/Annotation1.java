package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1

{
	
	@BeforeClass
	 public void openbrowser() 
	 {
		 Reporter.log("operbrowser", true);
	 }
	
	
	
	
	@BeforeMethod
	public void login() 
	{
		Reporter.log("test case for log in", true);
		
	}
	
	@Test
	public void verifyuserid() 
	{
		
	Reporter.log("test case for userid", true);

	}
		
@Test
public void verifyps() 
{
	
Reporter.log("test case for password", true);

}

@AfterMethod
public void logout()
{
	Reporter.log("testcase for logout", true);
}

@AfterClass
public void closeBrowser()
{
	Reporter.log("close the browser", true );
}
}
