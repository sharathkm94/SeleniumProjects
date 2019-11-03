package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		//System.setProperty("webdriver.gecko","./driver/firefoxdriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		WebElement un1 = driver.findElement(By.xpath("//input[@name = 'username']"));
		//WebElement un1 = driver.findElement(By.id("username"));
		un1.sendKeys("admin");
		Thread.sleep(1000);
		
		WebElement pw1 = driver.findElement(By.xpath("//input[@name = 'pwd']"));
		pw1.sendKeys("manager");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//div[.='Login ']"));
		login.click();
		Thread.sleep(6000);//delay..
		
		String hpt = driver.getTitle();
		System.out.println(hpt);
		
		if(hpt.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("actiTIME - Enter Time-Track page is display");
		}
		else
		{
			System.out.println("actiTIME - Enter Time Track page is not display");
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Licenses")).click();
		Thread.sleep(3000);
		
		String lcsp = driver.getTitle();
		System.out.println(lcsp);
		
		if(lcsp.equals("actiTIME - Licenses"))
		{
			System.out.println("actiTIME - Licenses page is display");
		}
		else
		{
			System.out.println("actiTIME - Licenses page is not display");
		}
		
		
		
	}

}
