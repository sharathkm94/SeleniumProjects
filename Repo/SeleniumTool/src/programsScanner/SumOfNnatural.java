package programsScanner;

import java.util.Scanner;

public class SumOfNnatural 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		
		int num = input.nextInt();
		int sum = 0;
		while(num>0)
		{
			sum=sum+num;
			num=num-1;
		}
		System.out.println("Sum of natural number is :" + sum);
		
	}

}
