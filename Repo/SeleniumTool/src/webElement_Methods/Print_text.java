package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_text {
	//a[@target ='_blank']
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.opensourcebilling.org/");
		Thread.sleep(5000);
		
		WebElement linkText= driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		String text = linkText.getText();
		System.out.println("The link text is : " +text);
		
		WebElement linktxt = driver.findElement(By.xpath("//a[@target ='_blank']"));//return first matching element
		String txt = linktxt.getText();
		System.out.println("The link text is : " +txt);
		
		
	}
}
