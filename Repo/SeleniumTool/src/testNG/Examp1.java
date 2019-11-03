package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Examp1 
{
	@BeforeMethod
	public void openApp()
	{
		System.out.println("Application is opened");
	}
	
	@Test(invocationCount=2)
	//@Test(priority =0,invocationCount=0)
	public void test1()                                                                                        
	{
		System.out.println("Application is tested ----> 1");
	}
	
	@Test(priority =0,invocationCount=1)
	public void test2()
	{
		System.out.println("Application is tested ----> 2");
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("Application is closed");
	}
}
