package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.opensourcebilling.org/");
		
		WebElement unTB = driver.findElement(By.id("email"));
		
		if(unTB.isEnabled())
		{
			System.out.println("Email textbox is enabled");
		}
		else
		{
			System.out.println("Email textbox is not enabled");
		}
	}

}
