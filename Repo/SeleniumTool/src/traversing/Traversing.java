package traversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		//System.setProperty("webdriver.gecko","./driver/firefoxdriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(5000);
		
		String hpt = driver.getTitle();
		System.out.println(hpt);
		Thread.sleep(6000);
		WebElement number=driver.findElement(By.xpath("//td[text() = 'Java']/../td[2]"));
		System.out.println(number.getText());
		
		
	}

}
