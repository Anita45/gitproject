package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3_keyword_enabled 
{
	
@Test
public void tc1()
{
	
Reporter.log("test case 1 running",true);
}
@Test
public void tc2()
{
	
Reporter.log("test case 2 running",true);
}
@Test(enabled=false)
public void tc3()
{
	
Reporter.log("test case 3 running",true);
}
}
