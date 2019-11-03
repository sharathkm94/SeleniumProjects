package crmApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCRMLoginPage extends FWutils
{
	static
	{
		System.setProperty(CHROM_KEY,CHROM_VALUE);
	}
	public static void main(String[] args) 
	{
		String un = FWutils.XL_Data_Read(XL_Data_Path, S1_name, 1,0);
		String pw = FWutils.XL_Data_Read(XL_Data_Path, S1_name, 1,1);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
		CRMLoginPage lp = new CRMLoginPage(driver);
		lp.setUN(un);
		lp.setPW(pw);
		lp.clksign();
		
	}

}
