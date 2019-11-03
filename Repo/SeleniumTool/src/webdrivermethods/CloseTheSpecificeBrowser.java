package webdrivermethods;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CloseTheSpecificeBrowser 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe" );
        //  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe" );
		  
	  }
	  
	  public static void browser(WebDriver driver)
	  {
		  driver.manage().window().maximize();
	        
	       //navigate to the mentioned Url without using get() method
			driver.navigate().to("https://www.naukri.com");
			
			Set<String> cwhs=driver.getWindowHandles();
			
			for(String w:cwhs)
			{
				String title=driver.switchTo().window(w).getTitle();
				
				System.out.println(title);
				
				if(title.contains("Amazon"))
				{
					 driver.close();		
				}
			}
			
	  }
	  
	  public static void main(String[] args) 
		{
			//open the browser
			WebDriver driver=new ChromeDriver();
		    browser(driver);
			
	//	    WebDriver driver1=new FirefoxDriver();
	 //       browser(driver1);
		     
		}
}
