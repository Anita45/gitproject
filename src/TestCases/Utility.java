package TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

	public class Utility
	{ 
	//@Author name: Anita
	//This method is use get inputs from excel sheet 
	//need to pass 2 parameters ie. 1. rowIndex, 2. colIndex 
	 
	
	 
	 
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException 
	{ 
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	File dest =new File("E:\\Selenium_15_sep\\Screenshot\\testcase"+TCID+".jpg"); 
	FileHandler.copy(src, dest); 
	} 
	
    }
	 
	