package aa;

import java.util.Scanner;

//WAP to read the 4 subject marks from the user and display the result.
//In any subject marks < 35 so fail; percentage> 80% so distinction,>60 first
//class,>50 2 nd class. Otherwise just pass

public class StudentPercentage 
{
	public static void main(String[] args) 
	{
		 int k,e,m,s,perc;
		 Scanner inp = new Scanner(System.in);
		 System.out.println("Enter the k marks out of 100");
		 k = inp.nextInt();
		 
		 System.out.println("Enter the e marks out of 100");
		 e = inp.nextInt();
		 
		 System.out.println("Enter the m marks out of 100");
		 m = inp.nextInt();
		 
		 System.out.println("Enter the s marks out of 100");
		 s = inp.nextInt();
		 
		 if(k<35 || e<35 || m<35 || s<35)
		 {
			 System.out.println("Fail");
		 }
		 else
		 {
			 perc = ((k+e+m+s)*100/400);
			 if(perc>80)
			 {
				 System.out.println("Distinction");
			 }
			 else if(perc>60)
			 {
				 System.out.println("First Class");
			 }
			 else if(perc>50)
			 {
				 System.out.println("Second Class");
			 }
			 else
			 {
				 System.out.println("Just Pass");
			 }
		 }
	}
}
