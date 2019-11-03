package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();//create browser object
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//set the browser timeout
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement dst = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(dst, src).perform();
		
	}

}
