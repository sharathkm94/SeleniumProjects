package miniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicenscesPage extends BaseTest
{
	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]")
	private WebElement pEdition;
	
	@FindBy(xpath="//nobr[text()='Issue Date:']/../../td[2]")
	private WebElement iDate;
	
	public LicenscesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifyProductEdition()
	{
		String aProductEdition = pEdition.getText();
		String eProductEdition="actiTIME 2017.4";
		if(aProductEdition.equals(eProductEdition))
		{
			System.out.println("Expected product edition is: "+eProductEdition);
		}
		else
		{
			System.out.println("Actual product edition is: "+aProductEdition);
		}
	}
}
