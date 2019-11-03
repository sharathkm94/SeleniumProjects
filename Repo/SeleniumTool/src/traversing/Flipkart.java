package traversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		//System.setProperty("webdriver.gecko","./driver/firefoxdriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		WebElement link1=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		link1.click();
		
		WebElement link=driver.findElement(By.xpath("//input[@class = 'LM6RPg']"));
		link.sendKeys("iphone6");
		
		WebElement link2=driver.findElement(By.xpath("//button[@type='submit']"));
		link2.click();
		Thread.sleep(6000);
		
		WebElement link3 = driver.findElement(By.xpath("//div[@class = '_3auQ3N _2GcJzG']"));
		System.out.println(link3.getText());
		Thread.sleep(6000);
		
		
		//WebElement link3=driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 6 (Space Grey, 32 GB)')]/../../div/div/div/div[2]"));
		//String price = link3.getText();
		//System.out.println(price);
		
}
}
