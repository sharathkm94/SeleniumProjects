package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyFrom_1_textbox_another 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opensourcebilling.org/");
		
		WebElement unTB = driver.findElement(By.id("email"));
		unTB.clear();
		unTB.sendKeys("Sharath@hotmail.com");
		String copyUnTB = unTB.getAttribute("value");
		
		WebElement pwTB = driver.findElement(By.id("password"));
		pwTB.clear();
		pwTB.sendKeys(copyUnTB);
		String  copyPwTB= pwTB.getAttribute("value");
		System.out.println("Password is :" +copyPwTB);
			
	}


}
