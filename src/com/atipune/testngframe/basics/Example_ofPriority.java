package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_ofPriority
{
@Test(priority=2)
public void testcase1() 
{
	Reporter.log("test case1", true);
}

@Test
public void testcase2() 
{
	Reporter.log("test case2",true);
}


@Test(priority=1)
public void testcase3() 
{
	Reporter.log("test case3", true);
}


@Test
public void testab4() 
{
	Reporter.log("test case4", true);
}


}
