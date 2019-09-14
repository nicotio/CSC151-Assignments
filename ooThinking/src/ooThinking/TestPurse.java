package ooThinking;
import java.util.*;

public class TestPurse {
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int check = 999;
		
		BritishPurse sophie = new BritishPurse();
		BritishPurse sally = new BritishPurse();
		
		
		
		while(check != 0)
		{
			System.out.println("Enter 1 for Sophie, 2 for Sally, or 0 to exit: ");
			check = input.nextInt();
			
			if(check == 1)
			{
				System.out.println("Enter 1 to give pence, 2 to give shillings, 3 to query her purses.");
				int ans = input.nextInt();
				
				if(ans == 1)
				{
					System.out.println("Enter pence to give");
					int money = input.nextInt();
					sophie.givePence(money);
				}
				
				else if(ans == 2)
				{
					System.out.println("Enter Shillings to give");
					int money = input.nextInt();
					sophie.giveShillings(money);
				}
				
				else
				{
					System.out.println(sophie.query());
				}
			}
			
			else if(check == 2)
			{
				System.out.println("Enter 1 to give pence, 2 to give shillings, 3 to query her purses.");
				int ans = input.nextInt();
				
				if(ans == 1)
				{
					System.out.println("Enter pence to give");
					int money = input.nextInt();
					sally.givePence(money);
				}
				
				else if(ans == 2)
				{
					System.out.println("Enter Shillings to give");
					int money = input.nextInt();
					sally.giveShillings(money);
				}
				
				else
				{
					System.out.println(sally.query());
				}
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
