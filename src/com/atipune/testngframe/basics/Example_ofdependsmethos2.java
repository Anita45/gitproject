package com.atipune.testngframe.basics;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_ofdependsmethos2 
{
	@Test()
	public void login()
	{
		
		
		Reporter.log("testcase login",true);
		Assert.fail();
	}
	
	
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
		//Reporter.log("testcase login",true);
		Reporter.log("testcase logout ",true);
	}
}
