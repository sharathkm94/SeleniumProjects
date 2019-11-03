package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo
{
	@Test (priority =2)
	public void delete_user()
	{
		Reporter.log("user deleted succesfully",true);
	}
	@Test (priority =1)
	public void edit_user()
	{
		Reporter.log("user edit succesfully",true);
	}
	@Test (priority =0,invocationCount=2)
	public void create_user()
	{
		Reporter.log("user created succesfully",true);
	}
	
}
