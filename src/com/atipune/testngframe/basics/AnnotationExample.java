package com.atipune.testngframe.basics;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample
{
	@BeforeSuite
	 public void BeforeSuite() 
	 {
		 
		Reporter.log(" BeforeSuite", true);
		 
	 }
	@Test
	 public void tc10() 
	 {
		 
		Reporter.log("testcase11", true);
		 
	 }
	
	
	

	@AfterMethod

	 public void AfterMethod() 
	 {
		 
		Reporter.log("AfterMethod", true);
		 
	 }

	@AfterSuite

	 public void tc3() 
	 {
		 
		Reporter.log("AfterSuite", true);
		 
	 }
	
	@BeforeTest

	 public void tc7() 
	 {
		 
		Reporter.log("BeforeTest", true);
		 
	 }
	@BeforeClass

	 public void tc9() 
	 {
		 
		Reporter.log("BeforeClass", true);
		 
	 }
	

	@BeforeMethod

	 public void BeforeClass() 
	 {
		 
		Reporter.log("beforeMethod", true);
		 
	 }
	@AfterTest

	 public void tc6() 
	 {
		 
		Reporter.log("AfterTest", true);
		 
	 }
	
	@AfterClass

	 public void tc8() 
	 {
		 
		Reporter.log("AfterClass", true);
		 
	 }


}
