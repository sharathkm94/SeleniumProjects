package miniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTTrackPage 
{
	@FindBy(xpath="(//div[contains(text(),'Settings')])[1]")
	private WebElement settings;
	
	
	@FindBy(xpath="//a[text()='Licenses']")
	private WebElement licenses;
	
	public EnterTTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnSettings()
	{
		settings.click();
	}
	public void clickOnLicenses()
	{
		licenses.click();
	}

}
