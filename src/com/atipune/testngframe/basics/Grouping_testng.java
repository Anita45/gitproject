package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_testng
{
@Test(groups="profile")
public void tc()
{
	Reporter.log("test case1",true);
}

@Test(groups="fund")
public void tc2()
{
	Reporter.log("test case2",true);
}
@Test(groups="orders")
public void tc3()
{
	Reporter.log("test case3",true);
}

}
