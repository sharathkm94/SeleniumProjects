package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class FWutils implements IAutoConstant
{
	public static void verifyHP(WebDriver driver,String etitle) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.titleContains(etitle));
		String atitle= driver.getTitle();
		Thread.sleep(3000);
		if(etitle.equals(atitle))
		{
			System.out.println("Expected Page is displayed" +etitle);
		}
		else
		{
			System.out.println("Expected Page is not displayed" +atitle);
		}
		
		
		
	}

}
