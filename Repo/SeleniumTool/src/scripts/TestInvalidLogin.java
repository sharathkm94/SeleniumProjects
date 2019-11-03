package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.FWUtils;
import pages.CrmLoginPage;

public class TestInvalidLogin extends FWUtils
{
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
		CrmLoginPage lp = new CrmLoginPage(driver);
		
		int rc= FWUtils.xlrow_Count(XL_DATA_PATH, "InvalidLogin");
		System.out.println("row count :" + rc);
		for (int i = 1; i<=rc; i++)
		{
			String un = FWUtils.read_XL_Data(XL_DATA_PATH,"InvalidLogin", i, 0);
			String pw = FWUtils.read_XL_Data(XL_DATA_PATH,"InvalidLogin", i, 1);
			
			lp.setUN(un);
			Thread.sleep(1000);
			lp.setPW(pw);
			Thread.sleep(1000);
			lp.clickSignIn();
			Thread.sleep(1000);
			lp.verifyErrMsg(driver);
			System.out.println(i);
			
			
		}
		
	}
	

}
