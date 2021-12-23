package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_ofEnabled

{
@Test
public void test() 
{
	Reporter.log("testcase1",true);
}
@Test(enabled=false)
public void test2() 
{
	Reporter.log("testcase2",true);
}
@Test
public void test3() 
{
	Reporter.log("testcase3",true);
}
@Test(enabled=false)
public void test4() 
{
	Reporter.log("testcase4",true);
}
}
