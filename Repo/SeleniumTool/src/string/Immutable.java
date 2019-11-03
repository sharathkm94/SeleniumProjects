package string;

public class Immutable 
{
	public static void main(String[] args) 
	{
		String str1 = new String("sha");
		System.out.println(str1==str1.concat("xyz"));
	}

}
