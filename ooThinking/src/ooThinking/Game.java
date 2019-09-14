package ooThinking;
import java.util.*;
public class Game {
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("Enter the home team");
		System.out.println("Enter the team member 1 name");
		String person1 = input.nextLine();
		System.out.println("Enter the team member 1 height");
		int ph1 = input.nextInt();
		input.nextLine();
			
		System.out.println("Enter the team member 2 name");
		String person2 = input.nextLine();
		System.out.println("Enter the team member 2 height");
		int ph2 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the team member 3 name");
		String person3 = input.nextLine();
		System.out.println("Enter the team member 3 height");
		int ph3 = input.nextInt();
		input.nextLine();
		
		/////////////////////////////////////////////////////////////////////////
		//AWAY
		
		
		System.out.println("Enter the away team");
		System.out.println("Enter the team member 1 name");
		String person4 = input.nextLine();
		System.out.println("Enter the team member 1 height");
		int ph4 = input.nextInt();
		input.nextLine();
			
		System.out.println("Enter the team member 2 name");
		String person5 = input.nextLine();
		System.out.println("Enter the team member 2 height");
		int ph5 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the team member 3 name");
		String person6= input.nextLine();
		System.out.println("Enter the team member 3 height");
		int ph6 = input.nextInt();
		input.nextLine();
		
		//HOME
		
		Player player1 = new Player(person1, ph1);
		Player player2 = new Player(person2, ph2);
		Player player3 = new Player(person3, ph3);
		
		//AWAY
		Player player4 = new Player(person4, ph4);
		Player player5 = new Player(person5, ph5);
		Player player6 = new Player(person6, ph6);
		
		//NEW TEAM
		Team homeTeam = new Team();
		homeTeam.add(player1);
		homeTeam.add(player2);
		homeTeam.add(player3);
		
		//NEW TEAM (AWAY)
		Team awayTeam = new Team();
		awayTeam.add(player4);
		awayTeam.add(player5);
		awayTeam.add(player6);
		
		int avg1 = homeTeam.averageHeight();
		int avg2 = awayTeam.averageHeight();
		
		if(avg1 > avg2)
		{
			System.out.println("The home team has the taller average height.");
			System.out.println("The taller roster is " + homeTeam.toString());
			System.out.println("The shorter roster is " + awayTeam.toString());
		}
		
		else if (avg1 < avg2)
		{
			System.out.println("The away team has the taller average height.");
			System.out.println("The taller roster is " + awayTeam.toString());
			System.out.println("The shorter roster is " + homeTeam.toString());
		}
		
		else
		{
			System.out.println("The both team height average is equal");
			System.out.println("The Home roster is " + homeTeam.toString());
			System.out.println("The Away roster is " + homeTeam.toString());
		}
		
		
		
		
	}

}
