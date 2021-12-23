package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class SofAssert_example
{
public void tasecase2() 
{
	String actresulyt="hii";
	String actresulyt1="hekod";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actresulyt, actresulyt1," 1 sy verification is faid bouth reslyt are fdiffrerbt");
	
	boolean result=false;
	soft.assertTrue(result,"2 nd verifivation is failed");
	Reporter.log("ggsdgghjsdoihig");
	soft.assertAll();
			


}
}
