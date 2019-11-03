package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Examp3 
{
	@BeforeMethod
	public void openApp()
	{
		System.out.println("Application is opened");
	}
	
	@Test(groups="test")
	public void test()                                                                                        
	{
		System.out.println("Login page----> 1");
	}
	
	@Test(groups="test")
	public void test2()
	{
		System.out.println("Home Page ----> 2");
	}
	
	@Test(groups="test")
	public void test3()
	{
		System.out.println("Search page ----> 3");
	}
	
	@Test(groups="login")
	public void login()
	{
		System.out.println("Search page ----> 3");
	}
	
	@Test(groups="login")
	public void home()
	{
		System.out.println("Search page ----> 3");
	}
	
	@Test(groups="login")
	public void verify()
	{
		System.out.println("Search page ----> 3");
	}
	@Test(groups="login")
	public void search()
	{
		System.out.println("Search page ----> 3");
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("Application is closed");
	}

}
