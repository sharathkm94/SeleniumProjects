package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmLoginPage 
{
	@FindBy(name="j_username")
	private WebElement unTB;
	
	@FindBy(id="passWord")
	private WebElement pwTB;
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement signInBtn;
	
	@FindBy(xpath=" //td[contains(text().'No such account configured for the user ')]")
	private WebElement errMsg;
	
	public CrmLoginPage(WebDriver driver)
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
	public void clickSignIn()
	{
		signInBtn.click();
	}
	public void verifyErrMsg(WebDriver driver)
	{
		try
		{
		if (errMsg.isDisplayed()) 
		{
			System.out.println("err msg is displayed");
			
		}
		else
		{
			driver.switchTo().alert().accept();
		}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}
	

}
