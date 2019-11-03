package programsScanner;

import java.util.Scanner;

public class CountEvenNum_1toN 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the from number");
		int i = input.nextInt();
		System.out.println("Please enter the to number");
		int n = input.nextInt();
		int count=0;
		int sum=0;
		if(i%2==1)
		{
			i++;
		}
			while(i<=n)
			{
				count++;
				i+=2;
				sum=sum+i;
			}
		System.out.println("Even number count is : " +count);
		System.out.println("Sum of even numbers are :" +sum);
	}

}
