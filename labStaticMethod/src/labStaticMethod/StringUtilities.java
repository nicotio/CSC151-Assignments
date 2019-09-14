package labStaticMethod;
import java.util.*;

public class StringUtilities {
	
	public static boolean needsTrim(String s)
	{
		String wow = s.trim();
		
		int num = s.length(), num1 = wow.length();
		
		if(num != num1)
		{
			return true;
		}
		
		else
			
		{
			return false;
		}
	}
	
	public static String Swap3for4(String s)
	{
		int x = s.length()-4;
		String i = s.substring(0,3);
		String j = s.substring(x);
		String k = j + s.substring(3,x) + i;
		return k;
	}

	public static boolean checkHalf(String s)
	{
		String first = s.substring(0,s.length()/2);
		String last = s.substring(s.length()/2);
		return first.equalsIgnoreCase(last);
	}

 public static void main(String[] args)
 {
	 
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter a string");
	 String test = input.nextLine();
	 
	 System.out.println(checkHalf(test));
	 
	 
 }
 
 
 
 
 
 
 
 
 
 
}