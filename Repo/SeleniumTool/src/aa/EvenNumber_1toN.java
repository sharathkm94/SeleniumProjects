package aa;

import java.util.Scanner;

public class EvenNumber_1toN 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter starting number");
		int f = inp.nextInt();
		System.out.println("Enter last number");
		int l = inp.nextInt();
			if(f%2!=0)
			{
				f++;
				while(f<=l)
				{
					System.out.println("Even no is : "+f);
					f+=2;
				}
			}
	}

}
