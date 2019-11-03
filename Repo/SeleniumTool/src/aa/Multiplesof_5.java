package aa;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Multiplesof_5 
{
	@Test
	public void mul_5()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = s.nextInt();
		System.out.println("Enter the number ");
		int last = s.nextInt();
		int count=0;
		while(num<=last)
		{
			num+=5;
			count++;
		}
		System.out.println(count);
	}
}
