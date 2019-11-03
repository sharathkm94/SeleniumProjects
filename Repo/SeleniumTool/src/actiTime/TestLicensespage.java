package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLicensespage extends FWutils
{
	static
	{
		System.setProperty(CHROM_KEY, CHROM_VALUE);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUN("admin");
		lp.setPW("manager");
		lp.login();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		Thread.sleep(3000);
		FWutils.verifyHP(driver,"actiTIME - Enter Time-Track");
		etp.setclick();
		etp.license();	
		
		Licensespage ltp = new Licensespage(driver);
		Thread.sleep(3000);
		FWutils.verifyHP(driver, "actiTIME - Licenses");
		ltp.verifyPE();
		ltp.verifyID();
	}

}
