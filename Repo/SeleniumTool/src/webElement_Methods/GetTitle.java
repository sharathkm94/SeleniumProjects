package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opensourcebilling.org/");
		
		WebElement etitle = driver.findElement(By.xpath("//title"));
		String title = etitle.getAttribute("textContent");
		System.out.println("Title of the Current web page is: " +title);
		
	}
}
