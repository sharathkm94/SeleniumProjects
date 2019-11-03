package synchronization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_links {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		}
		public static void main(String[] args) {
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com");
			
			List<WebElement> links = driver.findElements(By.xpath("//a"));
			int count = links.size();
			System.out.println(links);
			System.out.println("-----------");
			System.out.println(count);
			for(WebElement link:links)
			{
				String s = link.getText();
				System.out.println(s);
			}
			
		}

}
