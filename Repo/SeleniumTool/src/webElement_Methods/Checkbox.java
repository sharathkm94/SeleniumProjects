package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.opensourcebilling.org/");
		
		WebElement checkBox = driver.findElement(By.xpath("//label[contains(text(),'Keep me signed in')]"));
		Thread.sleep(2000);
		checkBox.click();
		
		WebElement tcB = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		System.out.println(tcB.isSelected());	
	}

}
