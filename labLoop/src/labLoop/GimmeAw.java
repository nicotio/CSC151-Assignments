package labLoop;
import java.util.Scanner;

public class GimmeAw {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		//Enter String
		System.out.println("Enter the string");
		String wake = input.nextLine();
		//System.out.println(wake.length());
		int user = 0;
		
		while (user != -1)
		{
			
			
			for ( int i = 0; i < wake.length(); i++ )
			{
				if (wake.charAt(i) == 'w' || wake.charAt(i) == 'W' || wake.charAt(i) == 't' || wake.charAt(i) == 'T' )
				{
				
				System.out.println("'w' or 't' at location " + i);
				
				}
				
			}
			System.out.println("enter -1 to exit");
			user = input.nextInt();
			if ( user ==  -1)
			{
				System.out.println("bye");
				System.exit(0);
			}
		
			
		}
			
		}
		
	
		
	}

