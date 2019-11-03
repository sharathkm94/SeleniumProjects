package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_Width {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.opensourcebilling.org/");
		
		//height and width of email text field
		WebElement unTB = driver.findElement(By.id("email"));
		int unH =unTB.getSize().getHeight();
		System.out.println("Height is : " + unH);
		int unW =unTB.getSize().getWidth();
		System.out.println("Width is : " + unW);
		
		System.out.println("-------------------------");
		WebElement pwTB = driver.findElement(By.id("password"));
		int pwH = pwTB.getSize().getHeight();
		System.out.println("Height is : " + pwH);
		int pwW=pwTB.getSize().getWidth();
		System.out.println("Width is : " + pwW);
		
		
		
	}

}
