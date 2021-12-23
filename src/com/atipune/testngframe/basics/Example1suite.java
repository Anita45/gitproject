package com.atipune.testngframe.basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1suite
{
	 @Test
	  public void Testmethod1() 
	  {
		  System.out.println("hello");
		  
	  }
	  @Test
	  public void Testmethod2() 
	  {
		  Reporter.log("testcas1",true);
	  }
	  @Test
	  public void Testmethod3() 
	  {
		  Reporter.log("testcase2 ",true);
		  
	  }
	  @Test
	  public void Testmethod4() 
	  {
		  Reporter.log("testcase 3",true);
	  }


}
