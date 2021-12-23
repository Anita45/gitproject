package Kite_application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_second_page_class
{
	//step 1 declaration 
		@FindBy(xpath="//input[@placeholder=\"PIN\"]") private  WebElement pin;
		
		@FindBy(xpath="//button[@type=\"submit\"]")private  WebElement Continuebtn;
		
		
		////button[@type="submit"]
		
		
		  public Kite_second_page_class(WebDriver driver)
		  {
			  
			  PageFactory.initElements(driver,this);
		  }
		  
		  
		  
		 // step3 usage
		  
		  public void  InpPinBtn(String pinNumber)
		  {
			  
			  pin.sendKeys("pinNumber");
		  }
		  
		  public void  clickContiBtn()
		  {
			  
			  Continuebtn.click();
		  }
		
		
		
	}

