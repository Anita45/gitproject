package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC1 
{
	
	
@Test
public void tc() 
{
	
Reporter.log("running tc..", true);
}

@Test
public void tc1() 
{
	
	Reporter.log("running tc111..", true);
}
}
