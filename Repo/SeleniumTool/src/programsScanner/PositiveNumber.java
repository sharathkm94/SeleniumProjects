package programsScanner;

import java.util.Scanner;

public class PositiveNumber 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = input.nextInt();
		if(num>0)
		{
			System.out.println(num + " is a Positive number");
		}
		else if(num<0)
		{
			System.out.println(num + " is a Negative number");
		}
		
	}

	private static void ifelse(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
