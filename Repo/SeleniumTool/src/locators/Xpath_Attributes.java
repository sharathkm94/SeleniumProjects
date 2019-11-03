package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attributes {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///G:/tool/xpath1.html");
		
		WebElement un1TB = driver.findElement(By.xpath("//input[@value='A']"));
		un1TB.clear();
		Thread.sleep(1000);
		un1TB.sendKeys("Sharath");
		Thread.sleep(1000);
		
		WebElement pw1TB = driver.findElement(By.xpath("//input[@value='B']"));
		pw1TB.clear();
		Thread.sleep(1000);
		pw1TB.sendKeys("123456");
		Thread.sleep(1000);
		
		WebElement un2TB = driver.findElement(By.xpath("//input[@value='C']"));
		un2TB.clear();
		Thread.sleep(1000);
		un2TB.sendKeys("Sharu");
		Thread.sleep(1000);
		
		WebElement pw2TB = driver.findElement(By.xpath("//input[@value='D']"));
		pw2TB.clear();
		Thread.sleep(1000);
		pw2TB.sendKeys("123789");
		Thread.sleep(1000);	
		
	}
}
