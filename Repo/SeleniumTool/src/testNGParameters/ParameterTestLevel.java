package testNGParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestLevel 
{
	@Parameters({"un","pw"})
	@Test
	public void testLogin(String un,String pw)
	{
		System.out.println("Username is : " + un);
		System.out.println("Password is : " + pw);
	}

}
