package labWritingClasses;
import java.util.*;
public class TestLinearPerson {

		public static void main(String[] args)
		{
			
			Scanner input = new Scanner(System.in);
			int position = 0, direction = 0;
			
			
			System.out.println("What is sophie position?");
			position = input.nextInt();
			
			System.out.println("What is the direction? (Enter 0 for right || Enter 1 for left)" );
			direction = input.nextInt();
			
			LinearPerson person2 = new LinearPerson(position, direction);
			
			System.out.println("Sophie is now at position " + person2.move() + " ,moving " + person2.getDirection());
			
			while (position != 2000000)
			{
			
			System.out.println("Do you want to change direction? (Y/N)");
			
			String check = input.next();
			
			if (check.equalsIgnoreCase("Y"))
			{
				person2.turn();
			}
			else
			{
			
			}
			
			System.out.println("Sophie is now at position " + person2.move() + " ,moving " + person2.getDirection());
			
			}
			
		}
}
