import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBasicLocators 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("G://tool/hello.html");
		
	  // String tagName = "a";
	  // By by =By.tagName(tagName);
	  // WebElement link = driver.findElement(By.tagName("a"));
	  // link.click();
		
		//instead of writing above lines we optimize the code as below
		
	  // WebElement link = driver.findElement(By.id("a1"));
	  // link.click();
		
	  // WebElement link = driver.findElement(By.name("n1"));
	  // link.click();
		
	  // WebElement link = driver.findElement(By.className("c1"));
	  // link.click();
		
	  // driver.findElement(By.linkText("Qspiders")).click();
		
		driver.findElement(By.partialLinkText("Qsp")).click();
		
		
	}
}
