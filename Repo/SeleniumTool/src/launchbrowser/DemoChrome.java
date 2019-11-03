//Program to launch the Chrome browser

package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe" );
	}

	public static void main(String[] args) 
	{
	//	String key="webdriver.chrome.driver";
	//    String Value="./driver/chromedriver.exe";
	    
	//    System.setProperty(key, Value); 
		
	    
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com");
	    
	    driver.close();
	    

	}

}
