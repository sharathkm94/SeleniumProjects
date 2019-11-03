package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Licensespage 
{
	@FindBy(xpath="//nobr[contains(text(),'Product Edition:')]/../../td[2]")
	private WebElement Pedition;
	
	@FindBy(xpath="//nobr[contains(text(),'Issue Date:')]/../../td[2]")
	private WebElement Issuedate;
	
	public Licensespage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyPE() throws InterruptedException
	{
		String aPE=Pedition.getText();
		String ePE="actiTIME 2017.4";
		Thread.sleep(3000);
		if(aPE.equals(ePE))
		{
			System.out.println("Expected product edition is : " +ePE);
		}
		else
		{
			System.out.println("Expected product edition is : " +aPE);
		}	
	}
	
	public void verifyID() throws InterruptedException
	{
		String aID=Issuedate.getText();
		String eID="Jul 14, 2017";
		Thread.sleep(3000);
		if(aID.equals(eID))
		{
			System.out.println("Expected issue date is displayed");
		}
		else
		{
			System.out.println("Expected issue date is not displayed");
		}	
	}

}
