package string;

import java.util.Scanner;

public class Index 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the index value");
		
		int i =s.nextInt();
		String str1 = s.next();
		
		//using builtin methods
		System.out.println(str1.charAt(i));
		
		char ch[] = str1.toCharArray();
		//without using builtin methods
		System.out.println(ch[i]);
		
		
	}

}
