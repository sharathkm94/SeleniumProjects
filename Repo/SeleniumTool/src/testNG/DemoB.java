package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest
{
	@Test
	public void testB()
	{
		Reporter.log("TestNG--->testB",true);
	}

}
