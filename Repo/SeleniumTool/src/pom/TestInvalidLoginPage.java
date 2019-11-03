
package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInvalidLoginPage 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUN("123");
		lp.login();
		driver.navigate().refresh();
		
		lp.setPW("123456");
		lp.login();
		driver.navigate().refresh();
		
		lp.login();
		driver.navigate().refresh();
		
		lp.setUN("sharath");
		lp.setPW("sharu");
		lp.login();
		driver.navigate().refresh();
		
		lp.setUN(" sharu");
		lp.setPW("@123$");
		lp.login();
		driver.navigate().refresh();
		
		lp.setUN("1234");
		lp.setPW("sharu");
		lp.login();
		driver.navigate().refresh();
		
		lp.setUN("admin");
		lp.setPW("Manager");
		lp.login();
		driver.navigate().refresh();
	}

}
