package Kite_application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteFirstPage 
{
	public WebDriver driver;

	//step declaration
	
	@FindBy(xpath="//input[@type=\"text\"]")   private WebElement UI;
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement PWD;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement Login;
	
	//step intiallization
	
	 public KiteFirstPage(WebDriver driver) 
	 {
		 
		 PageFactory.initElements(driver, this);
	 }
	
	//step usage
	 
	 public void InpUsernaeBtn(String user) 
	 {
		 
		 UI.sendKeys("user");
	 }
	 
	 
	 public void InpPassBtn(String pass) 
	 {
		 
		 UI.sendKeys("pass");
	 }
	 
	 
	 public void ClickLogBtn() 
	 {
		 
		 Login.click();
	 }
	
	
}

