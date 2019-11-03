package crmApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLoginPage 
{
	//Declaration
		@FindBy(id="userName")
		private WebElement unTB;
		
		@FindBy(id="passWord")
		private WebElement pwTB;
		
		@FindBy(xpath="//input[@title='Sign In']")
		private WebElement signin;
		
		//Initialization
		public CRMLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public void setUN(String un)
		{
			unTB.sendKeys(un);
		}
		public void setPW(String pw)
		{
			pwTB.sendKeys(pw);
		}
		public void clksign()
		{
			signin.click();
		}

}
