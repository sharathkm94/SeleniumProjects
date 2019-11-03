package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmHomePage {
	@FindBy(xpath="(//a[contains(text(),'Leads')])[1]")
	private WebElement leads;

	@FindBy(xpath="//a[contains(text(),'Accounts')]")
	private WebElement accounts;
	
	@FindBy(id = "Contactstab")
	private WebElement contacts;
	
	@FindBy(xpath="//a[contains(text(),'Potentials')]")
	private WebElement potentials;
	
	@FindBy(xpath="//a[contains(text(),'Campaigns')]")
	private WebElement campaigns;
	
	@FindBy(xpath="//a[contains(text(),'Products')]")
	private WebElement products;
	
	@FindBy(id="PriceBookstab")
	private WebElement pricebooks;
	
	@FindBy(xpath="//a[contains(text(),'Quotes')]")
	private WebElement quotes;
	
	@FindBy(xpath="//a[contains(text(),'Sales Orders')]")
	private WebElement salesorders;
	
	@FindBy(id="PurchaseOrderstab")
	private WebElement purchaseorder;
	
	@FindBy(xpath="//a[contains(text(),'Invoices')]")
	private WebElement invoice;
	
	public CrmHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setLeads()
	{
		leads.click();
	}
	public void setAccounts()
	{
		accounts.click();
	}
	public void setContacts()
	{
		contacts.click();
	}
	public void setPotentials()
	{
		potentials.click();
	}
	public void setCampaigns()
	{
		campaigns.click();
	}
	public void setProducts()
	{
		products.click();
	}
	public void setPriceBooks()
	{
		pricebooks.click();
	}
	public void setQuotes()
	{
		quotes.click();
	}
	public void setSalesOrders(String un)
	{
		salesorders.click();
	}
	public void setPurchaseOrders(String un)
	{
		purchaseorder.click();
	}
	public void setInvoice(String un)
	{
		invoice.click();
	}
	
	
}
