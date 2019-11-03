package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderActiTLogin 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");	
	}
	
//	@DataProvider
//	public String[][] input()
//	{
//		String a[][]  = new String[1][2];
//		
//		a[0][0]="admin";
//		a[0][1]="manager";
//		return a;
//	}
//	
//	public String read_XL_Data()
//	{
//		return "";
//	}

//	@DataProvider
//	public String[][] input1()
//	{
//		String a[][]  = new String[1][2];
//		
//		a[0][0]="admin";
//		a[0][1]="manager";
//		return a;
//	}
//	
//	@Test(dataProvider = "input1")
//	public void Login(String un,String pw) throws InterruptedException
//	{
//		driver.findElement(By.id("username")).sendKeys(un);
//		driver.findElement(By.name("pwd")).sendKeys(pw);
//		
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
//		
//		driver.findElement(By.xpath("(//div[contains(text(),'Settings')])[1]")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Licenses']")).click();
//		
//		WebElement issdate = driver.findElement(By.xpath("//nobr[contains(text(),'Issue Date:')]/../../td[2]"));
//		System.out.println(issdate.getText());
//	}
//	
	@DataProvider
	public String[][] input2()
	{
		String a[][]  = new String[4][2];
		
		a[0][0]="admin";
		a[0][1]="manager";
		
		a[1][0]="Sharath";
		a[1][1]="KM";
		
		a[2][0]="email.mail@gmail.com";
		a[2][1]="sharath@123";
		
		a[3][0]="123456";
		a[3][1]="123456";
		return a;
	}
//	
	@Test(dataProvider = "input2")
	public void createUser(String un,String pw,String fN,String sN,String email,String uN,String pW,String pW1) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 
		driver.findElement(By.xpath("//div[contains(text(),'USERS')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Add User')]")).click();
		 
	    driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(fN);;
	    
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(sN);
		
		driver.findElement(By.name("email")).sendKeys(email);
		
		driver.findElement(By.name("username")).sendKeys(uN);
		
		driver.findElement(By.name("password")).sendKeys(pW);
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pW1);
		
		driver.findElement(By.xpath("//span[contains(text(),'Create User')]")).click();	
		
		System.out.println("User is created successfully");
	}
//	

	
//	@Test(dataProvider = "input")
//	public void navigate(String un,String pw)
//	{
//		driver.findElement(By.id("username")).sendKeys(un);
//		driver.findElement(By.name("pwd")).sendKeys(pw);
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
//		
//		driver.navigate().to("http://localhost/login.do");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
//	}
//	
//	@Test(dataProvider = "input")
//	public void task(String un,String pw)
//	{
//		driver.findElement(By.id("username")).sendKeys(un);
//		driver.findElement(By.name("pwd")).sendKeys(pw);
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
//		WebElement clk2 = driver.findElement(By.xpath("//div[text()='Configure server access']/../../../td[1]"));
//		clk2.click();
//		
//	}
	@AfterMethod
	public void closeApp()
	{
		 String cURL= driver.getCurrentUrl();
		 System.out.println("Current URL is : " + cURL);
		 //driver.close();
	}

}
