package com.atipune.testngframe.basics;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Example1_verification 
{
	@Test
public void Tc1()
{
	String act="hiii";	
	String act1="hello";	
	Assert.assertNotSame(act, act1);
		
		
	}
	
	@Test
public void Tc2()
{
	String act="hello";	
	String act1="hello";	
	Assert.assertEquals( act,  act1);
		
		
	}
}
