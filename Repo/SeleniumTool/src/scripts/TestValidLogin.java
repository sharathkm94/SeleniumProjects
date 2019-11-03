package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.FWUtils;
import pages.CrmLoginPage;

public class TestValidLogin extends FWUtils
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
		
	}

}
