package popup;

import java.awt.AWTException;
import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download_popup {

	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new FirefoxDriver();//create browser object
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//set the browser timeout
		driver.manage().window().maximize();
		
		driver.get("http://docs.seleniumhq.org/download/");
		WebElement dlink = driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a"));
		dlink.click();
		
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);	
		
	}
}
