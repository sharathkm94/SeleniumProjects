package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseChildBrowsers 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe" );
	      System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe" );
		  
	  }
	  
	  public static void browser(WebDriver driver)
	  {
		  driver.manage().window().maximize();
	        
	       //navigate to the mentioned Url without using get() method
			driver.navigate().to("https://www.naukri.com");
			
			
			//get the reference of parent window
			String pwh=driver.getWindowHandle();
			System.out.println(pwh);
			
			//get the reference of parent window along with the child windows
			Set<String> cwhs=driver.getWindowHandles();
			System.out.println("count is: "+cwhs);
			
			//remove the parent window reference in order to avoid it from closing
			cwhs.remove(pwh);
			System.out.println("Reference of parent window is successfully removed");
			
		
			for(String w:cwhs)
			{
				//Switch from one browser to other
				driver.switchTo().window(w);
				
				//close the current browser
		        driver.close();	
			}
			
			/*
			 * 
			 //below is the other logic to close only the child browsers
			 if((cwhs.equals(w))
			 {
			   String s=driver.getTitle();
			   System.out.println(s);
			 }
			 else
			 {
			  driver.close();
			 } 
			 */
	  }
	  
	  public static void main(String[] args) 
		{
			//open the browser
			WebDriver driver=new ChromeDriver();
		    browser(driver);
			
		      WebDriver driver1=new FirefoxDriver();
		      browser(driver1);
		     
		}
}
