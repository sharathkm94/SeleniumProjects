package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A 
{
//	@Test
//	public void test1()
//	{
//		Reporter.log("Welcome to TestNG framework",true);
//	}
//	
	@Test(priority=0)
	public void test_A()
	{
		Reporter.log("Hi",true);
	}
	
	@Test(priority=-1)
	public void test_C()
	{
		Reporter.log("Hor are you",true);
	}
	
	@Test(priority=1)
	public void test_B()
	{
		Reporter.log("Bye",true);
	}

}
