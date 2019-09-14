package labstmt;
import java.util.Scanner;

public class weekend {
	
//	private static Scanner input;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String yes = "Y", no = "N", mall = ("Go shopping"), cinema = ("Watch a movie"), stay = ("Stay in");
		boolean pa = true, sun = true, money= true;
		
		//PARENTS
		System.out.print("Are your parents visiting? (Y/N) ");
		String dad = input.nextLine();
		
		if (dad == yes)
		{pa = true; }
		else if (dad == no)
		{pa = false;}
/*		else 
		{System.out.println("Restart the program, and please answer with Y or N"); 
		System.exit(0);} */
		
		
		//WEATHER
		System.out.print("Is the weather nice? (Y/N) ");
		String nice = input.nextLine();
		
		if (nice == yes)
		{sun = true; }
		else if (nice == no)
		{sun = false;}
/*		else 
		{System.out.println("Restart the program, and please answer with Y or N");
	    System.exit(0);}  */
		
		
		// MONEY
		System.out.print("Are you rich? (Y/N) ");
		String mula = input.nextLine();
		
		if (mula == yes)
		{money = true; }
		else if (mula == no)
		{money = false;}
/*		else 
		{System.out.println("Restart the program, and please answer with Y or N");
		System.exit(0);} */
		
	
		
		//IF ELSE 
		
		if (pa == true) 
		{System.out.println(cinema);}
		
		else if (pa == false)
		{
			if  (sun == true && money == true)
			{System.out.println(mall);}
			else if (sun == false && money == true)
			{System.out.println(cinema);}
			else if (sun == false && money == false)
			{System.out.println(stay);}
			else if (sun == true && money == false)
			{System.out.println(cinema);}
			else {System.out.print("ERROR");}
		}

}}
