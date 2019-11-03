package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CrmCampaignsPage 
{
	@FindBy(xpath="(//input[@type='button'])[27]")
	private WebElement newcampBtn;
	
	@FindBy(xpath="//input[contains(@name,'property(Campaign Name)')]")
	private WebElement campaignName;
	
	@FindBy(xpath="//input[contains(@name,'property(Start Date)')]")
	private WebElement startdate;
	
	@FindBy(xpath="//input[contains(@name,'property(Expected Revenue)')]")
	private WebElement expectedrevenue;
	
	@FindBy(xpath="//input[contains(@name,'property(Actual Cost)')]")
	private WebElement actualCost;
	
	@FindBy(xpath="//input[contains(@name,'property(Num sent)')]")
	private WebElement numsent;
	
	@FindBy(xpath = "//select[contains(@name,'property(Type)')]")
	private WebElement type;
	
	@FindBy(xpath = "//select[contains(@name,'property(Status)')]")
	private WebElement status;
	
	@FindBy(xpath = "//input[contains(@name,'property(End Date)')]")
	private WebElement endDate;
	
	@FindBy(xpath="//input[contains(@name,'property(Budgeted Cost)')]")
	private WebElement budgetedCost;
	
	@FindBy(xpath="//input[contains(@name,'property(Expected Response)')]")
	private WebElement expectedResponse;
	
	@FindBy(xpath="//textarea[contains(@name,'property(Description)')]")
	private WebElement description;
	
	@FindBy(xpath="(//input[contains(@value,'Save')])[1]")
	private WebElement saveBtn;
	
	@FindBy(xpath="(//input[contains(@value,'Cancel')])[1]")
	private WebElement cancelBtn;
	
	public CrmCampaignsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewCampBtn()
	{
		newcampBtn.click();
	}
	public void createCampName(String cn)
	{
		campaignName.clear();
		campaignName.sendKeys(cn);
		
	}
	public void setStartDate(String sd)
	{
		startdate.clear();
		startdate.sendKeys(sd);
	}
	public void setExpRevenue(String er)
	{
		expectedrevenue.clear();
		expectedrevenue.sendKeys(er);
	}
	public void setActualCost(String ac)
	{
		actualCost.clear();
		actualCost.sendKeys(ac);
	}
	public void setNumSent(String a)
	{
		numsent.clear();
		numsent.sendKeys(a);
	}
	public void setType(String value)
	{
		Select select = new Select(type);
		select.selectByValue(value);
		type.clear();
		type.sendKeys(value);
	}
	public void setStatus(String value)
	{
		Select select = new Select(status);
		select.selectByValue(value);
		status.clear();
		status.sendKeys(value);
	}
	public void setEndDate(String sd)
	{
		endDate.clear();
		endDate.sendKeys(sd);
	}
	public void setBudgetedCost(String bc)
	{
		budgetedCost.clear();
		budgetedCost.sendKeys(bc);
	}
	public void setExpectedResponse(String e)
	{
		expectedResponse.clear();
		expectedResponse.sendKeys(e);
	}
	public void wrtDesc(String s)
	{
		description.clear();
		description.sendKeys(s);
	}
	public void clickSave()
	{
		saveBtn.click();
	}
	public void clickDel()
	{
		cancelBtn.click();
	}
		
}
