package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1_attributes
{
	public class Demo1 
	{
		
	@Test( alwaysRun=true,dependsOnMethods= {"tes2"})
	public void test() 
	{
		Reporter.log("testcase5", true);
	}

	@Test
	public void tes2() 
	{
		Reporter.log("testcase7", true);
	}
	@Test
	public void test3() 
	{
		Reporter.log("testcase8", true);
	}
}
}
