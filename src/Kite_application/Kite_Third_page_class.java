package Kite_application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Third_page_class
{


	//step 1 declaration 
		@FindBy(xpath="//span[@class='user-id']\\") private WebElement ProfileID;
		
		
		
	
		
	 public Kite_Third_page_class(WebDriver driver)
	 {
		 
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 
	 public String getThirdPageuserid() 
	 {
		 
		String actText= ProfileID.getText();
		return actText;
	 }
}

	 
	 
	 
	// step3 usage
	 
//	public void  getVerifyProfile(String expResult) 
	//{
		//String act=ProfileID.getText();
	//	if(act.equals(expResult)) 
	
	 
