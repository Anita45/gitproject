package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_keyword_invocationcount
{
	
@Test(invocationCount=5)
public void TC1()
{
Reporter.log("running C1.class",true);	
}
}
