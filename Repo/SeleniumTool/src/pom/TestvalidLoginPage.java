package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestvalidLoginPage 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		LoginPage vlp = new LoginPage(driver);
		
		vlp.setUN("admin");
		vlp.setPW("manager");
		vlp.login();
	}
	

}
