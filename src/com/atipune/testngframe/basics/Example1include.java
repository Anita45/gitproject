package com.atipune.testngframe.basics;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1include
{
@Test
public void m1() 

{
	Reporter.log("testcase1",true);
	Assert.fail();
}
@Test
public void m2() 

{
	Reporter.log("testcase2",true);
}
@Test
public void m3() 

{
	Reporter.log("testcase3",true);
}
}
