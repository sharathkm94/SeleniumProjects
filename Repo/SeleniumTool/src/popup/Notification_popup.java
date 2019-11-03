package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);//create browser object
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//set the browser timeout
		driver.manage().window().maximize();
		
		driver.get("http://www.irctc.co.in/nget/train-search");
		
	}
}
