package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 

{
	
@Test(timeOut=100,threadPoolSize=3,invocationCount=2)
public void test4() 
{
	Reporter.log("testcase10", true);
}

@Test
public void test5() 
{
	Reporter.log("testcase8", true);
}
@Test
public void test6() 
{
	Reporter.log("testcase9", true);
}
}




