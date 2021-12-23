package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_keyword_priority
{
	
@Test(priority=2)	
public void testcase1() 
{
	
Reporter.log("running test case1",true);
}


@Test(priority=1)	
public void testcase2() 
{
	
Reporter.log("running test case2",true);
}

@Test	
public void testcase3() //by fefsult priority is 0
{
	
Reporter.log("running test case3",true);
}

@Test(priority=-1)	
public void testcase4() 
{
	
Reporter.log("running test case4",true);
}
}
