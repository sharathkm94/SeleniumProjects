package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
	@DataProvider
	public String[][] data()
	{
		String a[][]  = new String[4][2];
		
		a[0][0]="Admin";
		a[0][1]="Manager";
		
		a[1][0]="admin";
		a[1][1]=" ";
		
		a[2][0]=" ";
		a[2][1]="manager";
		
		a[3][0]="admin@123";
		a[3][1]="123345";
		
		return a;
		
	}
	@Test(dataProvider = "data")
	public void testLogin(String un,String pw)
	{		
		System.out.println("Username is :" +un);
		System.out.println("Password is :" +pw);
	}

}
