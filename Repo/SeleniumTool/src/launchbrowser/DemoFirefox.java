//Program to launch the Firefox browser

package launchbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox 
{

	public static void main(String[] args) 
	{
		//	String key="webdriver.gecko.driver";  //gecko is the driver executable name of firefox driver
	//    String Value="./driver/geckodriver.exe";
	    
	//    System.setProperty(key, Value);
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe" );
	    
	    FirefoxDriver driver=new FirefoxDriver();
	    

	}

}
