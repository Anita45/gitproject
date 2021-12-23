package com.atipune.testngframe.basics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_TCExcution_FromClassFromExcludeSuite 
{
	@Test	
	public void TC1()
	{
		Reporter.log("running TC1,true");
		Assert.fail();
	}
	@Test	
	public void TC2()
	{
		Reporter.log("running TC2,true");
	}
	@Test	
	public void TC3()
	{
		Reporter.log("running TC3,true");
		//Assert.fail();
	}
	@Test	
	public void TC4()
	{
		Reporter.log("running TC4,true");
	}
}
