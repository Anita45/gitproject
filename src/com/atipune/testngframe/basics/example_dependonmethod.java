package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example_dependonmethod 
{
	@Test()
	public void login()
	{
		
		
		Reporter.log("testcase login",true);
	}
	
	
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
		//Reporter.log("testcase login",true);
		Reporter.log("testcase logout ",true);
	}
}
