package programsScanner;

import java.util.Scanner;

public class ProductofNaturalNumber //factorial number
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		
		int num = input.nextInt();
		
		int prod=1;
		while(num>0)
		{
			prod*=num;
			num-=1;
		}
		System.out.println("Product of natural number is :" +prod);
		
	}

}
