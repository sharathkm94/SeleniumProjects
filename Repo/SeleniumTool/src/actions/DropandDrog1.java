package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrog1 
{
	static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		}
	
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();//create browser object
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//set the browser timeout
			driver.manage().window().maximize();
			
			driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
			
			WebElement src1 = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
			
			WebElement src2 = driver.findElement(By.xpath("//span[contains(text(),'Draggable 2')]"));
			WebElement src3 = driver.findElement(By.xpath("//span[contains(text(),'Draggable 3')]"));
			WebElement src4 = driver.findElement(By.xpath("//span[contains(text(),'Draggable 4')]"));
			
			WebElement dst = driver.findElement(By.id("mydropzone"));
			
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.dragAndDrop(src1,dst).build().perform();
			Thread.sleep(2000);
//			act.dragAndDrop(src2,dst).perform();
			Thread.sleep(2000);
//			act.dragAndDrop(src3,dst).perform();
			Thread.sleep(2000);
//			act.dragAndDrop(src4,dst).perform();
			
		}
}

