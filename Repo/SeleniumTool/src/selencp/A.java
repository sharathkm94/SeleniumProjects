package selencp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A 
{
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement login;
	
	public A(WebDriver driver)
	{
		unTB = driver.findElement(By.id("username"));
		pwTB = driver.findElement(By.xpath("//input[@name = 'pwd']"));
		login = driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setUN()
	{
		unTB.sendKeys("admin");
	}
	

}
