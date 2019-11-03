package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		System.setProperty("webdriver.gecko","./driver/firefoxdriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/tool/xpath1.html");
		
		//WebElement un1 = driver.findElement(By.xpath("html/body/div[1]/input[1]"));
		WebElement un1 = driver.findElement(By.xpath("//input[@value = 'A']"));
		un1.sendKeys("Admin");
		Thread.sleep(1000);
		
		//WebElement pw1 = driver.findElement(By.xpath("html/body/div[1]/input[2]"));
		WebElement pw1 = driver.findElement(By.xpath("//input[@value = 'B']"));
		pw1.sendKeys("Manager");
		Thread.sleep(5000);
		
		//WebElement un2 = driver.findElement(By.xpath("html/body/div[2]/input[1]"));
		WebElement un2 = driver.findElement(By.xpath("//input[@value = 'C']"));
		un2.sendKeys("Admin");
		Thread.sleep(1000);
		
		//WebElement pw2 = driver.findElement(By.xpath("html/body/div[2]/input[2]"));
		WebElement pw2 = driver.findElement(By.xpath("//input[@value = 'D']"));
		pw2.sendKeys("Manager");
		Thread.sleep(1000);
		

	}

}
