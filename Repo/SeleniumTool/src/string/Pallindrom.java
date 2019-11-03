package string;

public class Pallindrom 
{
	public static void main(String[] args) 
	{
		String str1= "SHARATH";
		//convert string to array
		//array of string
		char ch[] = str1.toCharArray();
		
		char arr[] = new char[ch.length];
		//reverse the array
		for (int i = 0,j=ch.length-1; i < ch.length; i++,j--)
		{
			arr[j] = ch[i];
		}
		//convert into string
		String str2 = String.valueOf(arr);
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1.equals(str2))
		{
			System.out.println("Pallindrom");
		}
		else
		{
			System.out.println("Not a pallindrom");
		}	
	}

}
