package grid;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_HardAssert 
{
	String actual = "Sharath";
	String expected = "Sharu";
	
	//Assert is a class it is having static methods
	//if actual and expected is not equal,it will not execute next statement(exist out of the test method) 
	//and it will execute next test method
	@Test
	public void testA()
	{
		Reporter.log("TestA Begin=====	",true);
		Assert.assertEquals(actual, expected);
		Reporter.log("TestA End======= 	",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("TestB Begin	",true);
		Reporter.log("Welcome to Assertion",true);
		Reporter.log("TestB End 	",true);
	}
	

}
