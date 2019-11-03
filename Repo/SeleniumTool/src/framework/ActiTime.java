package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		WebElement unTB = driver.findElement(By.xpath("//input[@name = 'username']"));
		unTB.sendKeys("admin");
		
		WebElement login = driver.findElement(By.xpath("//div[.='Login ']"));
		login.click();
		
		 driver.navigate().refresh();
	
		WebElement unTB1 = driver.findElement(By.xpath("//input[@name = 'username']"));
		unTB1.sendKeys("admin");
		
		WebElement pw = driver.findElement(By.xpath("//input[@name = 'pwd']"));
		pw.sendKeys("manager");
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
			
	}

}
