package string;
//WAP to print each word of a given string,count the number of words in a given string
public class EachWord_String 
{
	public static void main(String[] args) 
	{
		String str1 = "   WELCOME  TO QSP";
		char ch[] =str1.toCharArray();
		int i,j;
		int count=0;
		for (i = 0; i<ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				count=0;//3
				for(j=i;j<ch.length;j++)
				{
					System.out.print(ch[j]);
					count++;//3
					if((j==ch.length-1 && ch[j] != ' ')||(ch[j]!=' ' && ch[j+1] == ' '))
					{
						System.out.println("---->" +count);
						count++;//2
						break;
					}
				}
				i=j;
			}
			
		}
		System.out.println(count);
		
	}

}
