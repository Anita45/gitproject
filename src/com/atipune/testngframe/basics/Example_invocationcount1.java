package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_invocationcount1 
{
	
@Test(invocationCount=3)
public void testcase1()
{
	Reporter.log(" test case pass1");
}


}
