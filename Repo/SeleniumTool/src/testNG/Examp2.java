package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Examp2 
{
	@BeforeMethod
	public void openApp()
	{
		System.out.println("Application is opened");
	}
	
	@Test
	public void login()                                                                                        
	{
		System.out.println("Login page----> 1");
	}
	
	@Test(dependsOnMethods = "login")
	public void homePage()
	{
		System.out.println("Home Page ----> 2");
		int i=1/0;
	}
	
	@Test(dependsOnMethods = "homePage")
	public void searchPage()
	{
		System.out.println("Search page ----> 3");
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("Application is closed");
	}

}
