package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe" );
	  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe" );
	  
  }
  
  public static void browser(WebDriver driver)
  {
	  //Maximize the browser
	    driver.manage().window().maximize();
	    
	    //Enter the url
	    driver.get("https://www.google.com");
	    
	    System.out.println("===================================================");
	    
	    //Get the title of the webpage & print it
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    System.out.println("===================================================");
	    
	    
	    //get the current URL of the page
	    
	    String curl=driver.getCurrentUrl();
      System.out.println(curl);	   
      
     // String src=driver.getPageSource();
      //System.out.println(src);
      
    //  System.out.println("=======================================================");
      String gui=driver.getWindowHandle();
      System.out.println(gui);
    //  System.out.println("=======================================================");
      
      driver.navigate().to("https://www.gmail.com");
      String gtitle=driver.getTitle();
      System.out.println(gtitle);
      driver.navigate().back();
      
      driver.navigate().forward();
      
      driver.navigate().to("https://www.facebook.com");
      
      driver.close();
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
