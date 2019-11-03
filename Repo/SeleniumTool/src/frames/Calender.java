package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Calender 
{
	@Test
	public void calender() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
			driver.navigate().to("http://localhost/login.do");
			
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("(//div[contains(text(),'Login ')])[1]")).click();
			//verifyPage(driver);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'New')]")).click();
			Thread.sleep(3000);
			
			//to perform mouse actions
			Actions action = new Actions(driver);
			
//			WebElement sc = driver.findElement(By.xpath("//button[contains(text(),'- Select Customer -')]"));
//			action.moveToElement(sc).build().perform();
//			sc.click();
//			Thread.sleep(2000);
//			
//			WebElement sa = driver.findElement(By.xpath("//a[contains(text(),'Architects Bureau')]"));
//			action.moveToElement(sa).build().perform();
//			sa.click();
//			Thread.sleep(2000);
			
			WebElement sp = driver.findElement(By.xpath("//button[contains(text(),'- Select Project -')]"));
			action.moveToElement(sp).build().perform();
			sp.click();
			Thread.sleep(2000);
			
			WebElement so = driver.findElement(By.xpath("(//a[contains(text(),'One-page web site')])[2]"));
			action.moveToElement(so).build().perform();
			so.click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("Annappa");
			driver.findElement(By.xpath("(//button[contains(text(),'Non-Billable')])[2]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'programming')]")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'Create Tasks')]")).click();
//			driver.findElement(By.id("closeCreateTasksPopupButton")).click();
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
			
	}
}
