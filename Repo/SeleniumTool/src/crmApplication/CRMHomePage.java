package crmApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMHomePage 
{
	@FindBy(xpath="(//a[contains(text(),'Leads')])[1]")
	private WebElement leads;
	
	@FindBy(xpath="(//a[contains(text(),'Accounts')])[1]")
	private WebElement accounts;
	
	@FindBy(xpath="(//a[contains(text(),'Contacts')])[1]")
	private WebElement contacts;
	
	@FindBy (xpath="(//a[contains(text(),'Potentials')])[1]")
	private WebElement potentials;
	
	@FindBy(xpath="//a[contains(text(),'Campaigns')]")
	private WebElement campaigns;
	
	@FindBy(xpath="//a[contains(text(),'Reports')]")
	private WebElement reports;
	
	@FindBy(xpath="//input[contains(@value,'New Campaign')]")
	private WebElement newcamp;
	
	
	
	//Initialization
	public CRMHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void clkCamp()
	{
		campaigns.click();
	}
	
	public void verifyCP()
	{
		
	}
}
