package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		//System.setProperty("webdriver.gecko","./driver/firefoxdriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irctc.com");
		Thread.sleep(5000);
		
		String hpt = driver.getTitle();
		System.out.println(hpt);
		Thread.sleep(6000);
		WebElement number=driver.findElement(By.xpath("//label[text() = 'Mumbai']/../label[2]"));
		System.out.println(number.getText());
		
		
	}
		
}
