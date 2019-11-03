package grid;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_1 
{
	String actual = "Sharath";
	String expected = "Sharu";
	
	//in soft assertion if condition fails also next statement will be executed
	//by default test method result is passed,so if we want to check the status of the test method
	//we use assertAll method it will check the assertEquals() is true or false
	
	@Test
	public void testA()
	{
		SoftAssert as = new SoftAssert();
		
		Reporter.log("TestA Begin	",true);
		as.assertEquals(actual, expected);
		Reporter.log("Welcome to Assertion",true);
		Reporter.log("TestA End 	",true);
		//as.assertAll();
		
		
	   
		
	}
	

}
