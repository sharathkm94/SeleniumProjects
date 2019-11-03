package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.FWUtils;
import pages.CrmCampaignsPage;
import pages.CrmHomePage;
import pages.CrmLoginPage;

public class TestValidCampPage extends FWUtils
{
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	public static void main(String[] args) 
	{
		String un = FWUtils.read_XL_Data(XL_DATA_PATH,"ValidLogin", 1, 0);
		String pw = FWUtils.read_XL_Data(XL_DATA_PATH,"ValidLogin", 1, 1);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
		CrmLoginPage lp = new CrmLoginPage(driver);
		lp.setUN(un);
		lp.setPW(pw);
		lp.clickSignIn();
		
		
		CrmHomePage hp = new CrmHomePage(driver);
		hp.setCampaigns();
		
		CrmCampaignsPage cp = new CrmCampaignsPage(driver);
		int rc= FWUtils.xlrow_Count(XL_DATA_PATH, "CrmValidCamp");
		System.out.println("row count :" + rc);
		for (int i = 1; i <=rc; i++) 
		{
		
			
		String cn = FWUtils.read_XL_Data(XL_DATA_PATH, "CrmValidCamp", i, 0);
		String sd = FWUtils.read_XL_Data(XL_DATA_PATH, "CrmValidCamp", i, 1);
		String er = FWUtils.read_XL_Data(XL_DATA_PATH, "CrmValidCamp", i, 2);
		String ac1 = FWUtils.read_XL_Data(XL_DATA_PATH, "CrmValidCamp", i, 3);
		String ns = FWUtils.read_XL_Data(XL_DATA_PATH, "CrmValidCamp", i, 4);
		
		String ed = FWUtils.read_XL_Data(XL_DATA_PATH, "CrmValidCamp", i, 7);
		String bc = FWUtils.read_XL_Data(XL_DATA_PATH, "CrmValidCamp", i, 8);
		String e = FWUtils.read_XL_Data(XL_DATA_PATH, "CrmValidCamp", i, 9);
		
		
		cp.clickNewCampBtn();
		cp.createCampName(cn);
		cp.setStartDate(sd);
		cp.setExpRevenue(er);
		cp.setActualCost(ac1);
		cp.setNumSent(ns);
		cp.setEndDate(ed);
		cp.setBudgetedCost(bc);
		cp.setExpRevenue(e);
		cp.clickSave();
		
		
		
		

		
		}
		
		
		
		
	}

}
