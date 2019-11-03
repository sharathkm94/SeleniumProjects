package programsScanner;

import java.util.Scanner;

public class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius");
		
		double num = input.nextDouble();
		
		double radius = 3.1415*num*num;
		System.out.println("Area of Circle is " + radius);
		
	}

}
