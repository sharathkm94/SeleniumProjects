package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC extends BaseTest
{
	@Test
	public void testC()
	{
		Reporter.log("TestNG--->testC",true);
	}

}
