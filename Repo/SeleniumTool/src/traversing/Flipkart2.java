package traversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
	
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
		
		WebElement link1=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		link1.click();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		
		WebElement link=driver.findElement(By.xpath("//input[@class = 'LM6RPg']"));
		link.sendKeys("Redmi Note 7 Pro");
		Thread.sleep(3000);
		
		WebElement link2=driver.findElement(By.xpath("//button[@type='submit']"));
		link2.click();
		Thread.sleep(6000);
		
		WebElement phoneprice = driver.findElement(By.xpath("(//div[contains(text(),'Redmi Note 7 Pro')])[1]/../../div[2]/div[4]/span"));
		Thread.sleep(5000);
		
		String rs =phoneprice.getText();
		Thread.sleep(5000);
		
		System.out.println("EMI starts from --> Rs :" + rs);
		
	}

}
