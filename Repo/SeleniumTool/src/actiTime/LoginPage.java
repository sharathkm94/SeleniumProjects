package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement erMsg;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void setUN(String UN)
	{
		unTB.sendKeys(UN);
	}
	
	public void setPW(String PW)
	{
		pwTB.sendKeys(PW);
	}
	
	public void login()
	{
		login.click();
	}	
	
	public void erMsg()
	{
		if(erMsg.isDisplayed())
		{
			System.out.println("Error message is displayed");
		}
		else
		{
			System.out.println("Error message is not displayed");
		}
	}
}
