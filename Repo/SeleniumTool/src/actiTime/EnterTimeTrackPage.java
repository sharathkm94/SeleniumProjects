package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage
{
	@FindBy(xpath="(//div[contains(text(),'Settings')])[1]")
	private WebElement setting;
	
	@FindBy(linkText="Licenses")
	private WebElement licenses;
	
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setclick()
	{
		setting.click();
	}
	
	public void license()
	{
		licenses.click();
	}

}
