package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();//create browser object
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//set the browser timeout
		driver.manage().window().maximize();
		
		driver.get("http://www.vtiger.com");
		WebElement resTb = driver.findElement(By.xpath("//a[text()='Resources']"));
		
		Actions acti = new Actions(driver);
		acti.moveToElement(resTb).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
								
		WebElement hrCnt = driver.findElement(By.xpath("//div[text()='Human Resources']/../../div[2]"));
		int y = hrCnt.getLocation().getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+y+" )");
		System.out.println(hrCnt.getText());
		
		
	}

}
