package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://demo.opensourcebilling.org/");
		driver.get("http://localhost/login.do");
		
		WebElement unTB = driver.findElement(By.id("username"));
		unTB.clear();
		unTB.sendKeys("Sharath");
		String text = unTB.getAttribute("value");
		System.out.println(text);
	}

}
