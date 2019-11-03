package select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelect {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("G://tool/select.html");
		
		WebElement mlist = driver.findElement(By.id("mtr"));
		
		Select sel = new Select(mlist);
		System.out.println(sel.isMultiple());
	
		sel.selectByVisibleText("Dosa");
		Thread.sleep(3000);
		sel.selectByVisibleText("Poori");
		Thread.sleep(3000);
		sel.selectByVisibleText("Vada");
		Thread.sleep(3000);
		sel.selectByVisibleText("CCBath");
	
		WebElement fsel = sel.getFirstSelectedOption();
		System.out.println(fsel.getText());
		
	}

}
