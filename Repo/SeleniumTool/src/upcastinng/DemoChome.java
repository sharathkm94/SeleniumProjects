package upcastinng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoChome 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe" );
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe" );
	}
	
	public static void testBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		testBrowser(driver);
		
		FirefoxDriver driver1=new FirefoxDriver();
		testBrowser(driver1);
	}
}
