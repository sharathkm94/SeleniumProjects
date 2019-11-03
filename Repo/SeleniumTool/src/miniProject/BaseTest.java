package miniProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoconstant
{
	public WebDriver driver;
	static
	{
		System.setProperty(CHROM_KEY,CHROM_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}

