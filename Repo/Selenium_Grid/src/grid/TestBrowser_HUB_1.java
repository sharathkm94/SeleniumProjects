package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser_HUB_1 
{
	@Parameters({"rsNode","browser"})
	@Test
	public void testBrowser(String rsNode,String browser) throws MalformedURLException
	{
		URL node = new URL(rsNode);
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(node,ds);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		for(int i=0;i<=20;i++)
		{
			driver.get("http://localhost/login.do");
			WebElement unTB = driver.findElement(By.id("username"));
			unTB.clear();
	    	unTB.sendKeys("admin");
		}
	}

}
