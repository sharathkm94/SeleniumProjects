package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestBrowser_HUB 
{
	@Test
	public void testBrowser() throws MalformedURLException
	{
		URL node = new URL("http://192.168.43.143:4444/wd/hub");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver(node,ds);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");	
	}

}
