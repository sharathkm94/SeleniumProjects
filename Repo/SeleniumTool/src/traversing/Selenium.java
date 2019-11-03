package traversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium 
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
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(6000);
		
		/*String hpt = driver.getTitle();
		System.out.println(hpt);
		Thread.sleep(6000);
		*/
		WebElement link=driver.findElement(By.xpath("//td[text()='Ruby']/../td[4]/a"));
		//System.out.println(link.getText());
		link.click();
		
		
	}

}
