package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign23 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/ServiceLogin");
		
		WebElement un=driver.findElement(By.id("identifierId"));
		Thread.sleep(7000);
		un.sendKeys("kmsharathv@gmail.com");
		
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(7000);
		
		WebElement pw=driver.findElement(By.name("password"));
		Thread.sleep(7000);
		pw.sendKeys("PushPa@1994");
		
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		Thread.sleep(7000);
		next.click();
		
		WebElement hlink = driver.findElement(By.xpath("(//a[contains(@role,'button')])[1]"));
		Thread.sleep(5000);
		hlink.click();
		
		
		
		
			
	}
}
