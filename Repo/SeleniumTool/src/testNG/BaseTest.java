package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	@BeforeMethod
	public void m1()
	{
		Reporter.log("Before Method " ,true);
	}
	@AfterMethod
	public void m2()
	{
		Reporter.log("After Method " ,true);
	}
	@BeforeClass
	public void m3()
	{
		Reporter.log("Before Class" ,true);
	}
	@AfterClass
	public void m4()
	{
		Reporter.log("After class" ,true);
	}
	@BeforeTest
	public void m5()
	{
		Reporter.log("Before Test" ,true);
	}
	@AfterTest
	public void m6()
	{
		Reporter.log("After Test" ,true);
	}
	@BeforeSuite
	public void m7()
	{
		Reporter.log("Before Suite " ,true);
	}
	@AfterSuite
	public void m8()
	{
		Reporter.log("After Suite" ,true);
	}

}
