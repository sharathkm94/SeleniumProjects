package popup;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_popup {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/contact-support");
		int y = driver.findElement(By.xpath("//label[text()='Attach file']")).getLocation().getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+y+")");
		
		String path = "C:/Users/Nagabhushan.M N/Desktop/Functional TC.txt";
		driver.findElement(By.id("//input[@id='fileupload']")).sendKeys(path);
		
		
	}
}
