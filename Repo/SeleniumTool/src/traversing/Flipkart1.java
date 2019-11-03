package traversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		//System.setProperty("webdriver.gecko","./driver/firefoxdriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		WebElement searchBox = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		
		//searchBox.sendKeys("Apple iPhone 6", key.);
		WebElement link=driver.findElement(By.xpath("//input[@class = 'LM6RPg']"));
		link.sendKeys("iphone6");
		Thread.sleep(3000);
		
		WebElement phoneprice = driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone X')])[1]/../../div[2]/div[1]/div/div[2]"));
		Thread.sleep(5000);
		
		String rs = phoneprice.getText();
		Thread.sleep(6000);
		
		System.out.println("Rs :" + rs);
		driver.close();
		
	}

}
