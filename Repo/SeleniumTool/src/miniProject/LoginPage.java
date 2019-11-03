package miniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement unTB;

	@FindBy(name="pwd")
	private WebElement pwTB;

	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnBTN;
	
	@FindBy(xpath="//span[contains(text(),'invalid.')]")
	private WebElement errMSG;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUN(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPW(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickOnLoginBTN()
	{
		lgnBTN.click();
	}
	public void verifyErrMSg()
	{
		if(errMSG.isDisplayed())
		{
			System.out.println("Error Message is Displayed");
		}
		else
		{
			System.out.println("Error Message is not Displayed");
		}
	}
	

}