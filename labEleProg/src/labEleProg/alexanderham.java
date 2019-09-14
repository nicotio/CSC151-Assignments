package labEleProg;
import java.util.Scanner;


public class alexanderham {
	
	private static Scanner input;

	public static void main (String[] arg)
	{
		input = new Scanner(System.in);
	
		int pound, shill, pence, newpence, piep, pies, piepie, beerp, bees, beep, newpie, newbeer, jack;
		
		
		// Jack's Pound
		System.out.print("Enter the pounds that Jack has: ");
		pound = input.nextInt();
		
		// Jack's Shillings
		System.out.print("Enter the shillings that Jack has: ");
		shill = input.nextInt();
		
		// Jack's Pence
		System.out.print("Enter the pence that Jack has: ");
		pence = input.nextInt();
		
		//Pie's Pound
		System.out.print("Enter the pounds for the pie: ");
		piep = input.nextInt();
		
		//Pie's Shillings
		System.out.print("Enter the shillings for the pie: ");
		pies = input.nextInt();
		
		//Pie's Pence
		System.out.print("Enter the pence for the pie: ");
		piepie = input.nextInt();
		
		//Beer's Pound
		System.out.print("Enter the pounds for the beer: ");
		beerp = input.nextInt();
		
		//Beer's Shillings
		System.out.print("Enter the shillings for the beer: ");
		bees = input.nextInt();
		
		//Beer's Pence
		System.out.print("Enter the pence for the beer: ");
		beep = input.nextInt();
		
		//Jack's Money
		pound *= 20*12;
		shill *= 12;
		newpence = pence + pound + shill;
		
		//Pie's cost
		piep *= 20*12;
		pies *= 12;
		newpie = piep + pies + piepie;
		
		//Beer's cost
		beerp *= 20*12;
		bees *= 12;
		newbeer = beerp + bees + beep;
		
		//Calculations
		jack = newpence - (newpie + newbeer);
		pound = jack / (20*12);
		shill = (jack - (pound*240)) / 12;
		pence = jack - (pound*240) - (shill*12);
		
		//Jack's change
		
		System.out.println("Jack's change is " + pound +" pounds, " + shill + " shillings, and "  + pence + " pence.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
