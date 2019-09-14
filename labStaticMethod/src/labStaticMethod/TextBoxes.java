package labStaticMethod;
import java.util.*;

public class TextBoxes {

	public static String textBoxString(int s)
	{
		
		String j="";
		int check = 0;
		while( check != s)
		
		{
			for(int i=0; i<s; i++)
			{
				j = "*" + j ;
			}
		
			j = '\n' + j;
			check++;
		}
			return j;
	}
	
	public static String textBoxString(int s, char bChar)
	{
		String j="";
		int check = 0;
		while (check != s)
		{
			
			for (int i=0; i < s; i++)
			{
				j = bChar + j;
			}
				j = '\n' + j;
				check++;
			
			
		}
		return j;
	}
	
	public static String textBoxString(int r, int c)
	{
		String j="";
		int check = 0;
		while (check != r)
		{
			
			for (int i = 0; i < c; i++)
			{
				j = "*" + j;
			}
				j = '\n' + j;
				check++;
				
		}
			return j;
	}
	
	public static String swap(String i)
	{
		return i;
	}
	
	public static String textBoxString(int r, int c, char c1, char c2)
	{
		String j="";
		int check = 0;
		int odd = 0;
		while (check != r)
		{
			for (int i = 0; i < c; i++){
			if (odd%2 == 0)
			{
				j = c1 + j;
				odd++;
			}
			else
			{
				j = c2 + j;
				odd++;
			}
			}
			j = '\n' + j;
		
			check++;
		}
		
		return j;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows");
		int s = input.nextInt();
		System.out.println("Enter cols");
		int d = input.nextInt();
		System.out.print("Enter c1");
		char x = input.next().charAt(0);
		System.out.println("Enter c2");
		char y = input.next().charAt(0);
		System.out.println(textBoxString(s,d,x,y));
	}
}