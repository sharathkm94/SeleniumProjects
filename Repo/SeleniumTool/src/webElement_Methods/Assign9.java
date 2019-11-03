package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign9 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.opensourcebilling.org/");
		
		WebElement unTb = driver.findElement(By.id("email"));
		unTb.clear();
		unTb.sendKeys("KMS software");
		String text = unTb.getAttribute("value");
		System.out.println(text);
		
		String id = unTb.getAttribute("id");
		System.out.println(id);
	}

}
