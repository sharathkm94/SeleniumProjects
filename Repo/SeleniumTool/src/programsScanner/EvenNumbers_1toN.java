package programsScanner;

import java.util.Scanner;

public class EvenNumbers_1toN {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the from number");
		int i = input.nextInt();
		System.out.println("Please enter the to number");
		int n = input.nextInt();
		int sum=0;
		int count=0;
		//if(i%2==1)//for even
		if(i%2==0)//for odd
		{
			i++;
		}
			while(i<=n)
			{
				System.out.println("Even numbers is :" +i);
				sum=sum+i;
				count++;
				i=i+2;
				//i+=2;
			}
			//System.out.println("Sum of even numbers are :"+sum);
			//System.out.println("Even numbers count is :" +count);
			System.out.println("Sum of odd numbers are :"+sum);
		    System.out.println("Odd numbers count is :" +count);
	}
}
		
