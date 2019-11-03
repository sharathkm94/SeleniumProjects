package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//print the font size,color & style of an element 

public class Assign8 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.opensourcebilling.org/");
		
		WebElement unTb = driver.findElement(By.id("email"));
		String fontsize = unTb.getCssValue("font-size");
		System.out.println(fontsize);
		
		String color = unTb.getCssValue("color");
		System.out.println(color);
		
		String fontstyle = unTb.getCssValue("font-style");
		System.out.println(fontstyle);
		
		
	}

}
