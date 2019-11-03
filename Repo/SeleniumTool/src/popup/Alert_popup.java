package popup;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://www.localhost/login.do");
		
		driver.get("http://www.localhost/administration/customization.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		
		WebElement clk = driver.findElement(By.xpath("(//label[contains(text(),'Use custom logo:')])[1]"));
		clk.click();
		driver.findElement(By.xpath("//div[text()='Save']")).click();
		
		Alert alert = driver.switchTo().alert();
		String s = alert.getText();
		System.out.println(s);
		alert.accept();
		
		
	}
}
