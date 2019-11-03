package programsScanner;

import java.util.Scanner;

public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the amount");
		long p_Amou  = input.nextLong();
		
		System.out.println("Please enter the tennure/duration");
		double year  = input.nextDouble();
		
		System.out.println("Please enter the rate");
		int rate_Inte  = input.nextInt();
		
		double si = getSI(p_Amou,year,rate_Inte);
		System.out.println("Simple interest is : " + si);
		
//		double si = (p_Amou*year*rate_Inte)/100;
	}
		public static double getSI(long p,double t,int r)
		{
			double si = (p*t*r)/100;
			return si;
		}	
	}
