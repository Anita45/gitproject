package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_keyword_timeout
{
@Test(timeOut=5000)
public void testcse() throws InterruptedException
{
	
	Thread.sleep(3000);
	Reporter.log("testcase",true);
}
}