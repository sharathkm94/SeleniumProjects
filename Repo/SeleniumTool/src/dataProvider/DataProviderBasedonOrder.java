package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasedonOrder 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public WebDriver driver ;
	@BeforeMethod
	public void openApp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
	}
	@DataProvider
	public String[][] data()
	{
		String a[][]  = new String[1][2];
		
		a[0][0]="admin";
		a[0][1]="manager";
		
//		a[1][0]="admin";
//		a[1][1]=" ";
//		
//		a[2][0]=" ";
//		a[2][1]="manager";
//		
//		a[3][0]="admin@123";
//		a[3][1]="123345";
		
		return a;	
	}
	@Test(dataProvider = "data")
	public void testLogin(String un,String pw)
	{
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
