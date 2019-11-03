package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentofDriverMethods 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
  }
  
  public static void drivermethods(WebDriver driver1)
  {
	        driver1.manage().window().maximize();
	        
	       //navigate to the mentioned Url without using get() method
			driver1.navigate().to("https://www.facebook.com");	
			
			
			//Retrieves the title of the page & stores in the variable title1.
			String title1=driver1.getTitle();
			System.out.println("The title of the page is: "+title1);
			
			//to retrieve the current Url
			String curl1=driver1.getCurrentUrl();
			System.out.println("The current page URL is: "+curl1);
			
			//to get the reference of that GUI window.
			String cref1=driver1.getWindowHandle();
			System.out.println("Current refernce of the GUI window is: "+cref1);
			
			//navigating from current webpage (i.e from facebook login page) to new web page (ex: i.e gmail)
			driver1.navigate().to("https://www.gmail.com");
			
			//close the current chrome browser
			driver1.close();
			
			
  }
	public static void main(String[] args) 
	{
		//Opens the browser & Stores the reference of current Chrome browser to the driver1
		 WebDriver driver1=new ChromeDriver();
		 drivermethods(driver1);
		
		//Opens the browser & Stores the reference of current Firefox browser to the driver1
	    WebDriver driver2=new FirefoxDriver();
	    drivermethods(driver2);
		
	}

}
