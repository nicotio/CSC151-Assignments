package labEleProg;
import java.util.Scanner;

public class mygrade {
		
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		double lab, read, video, midterm, proj, fin, teacher, average;
		
		//Lab Grade
		System.out.print("Enter Labs average in percent: ");
		lab = input.nextDouble();
		
		
		//Reading Quiz
		System.out.print("Enter Reading average in percent: ");
		read = input.nextDouble();
		
		//Video Grading
		System.out.print("Enter Video average in percent: ");
		video = input.nextDouble();
		
		//Midterm Grade
		System.out.print("Enter Midterm average in percent: ");
		midterm = input.nextDouble();
		
		//Project
		System.out.print("Enter Project average in percent: ");
		proj = input.nextDouble();
		
		//Final
		System.out.print("Enter Final average in percent: ");
		fin = input.nextDouble();
		
		//Instructor Discretion
		System.out.print("Enter Instructor DIscretion average in percent: ");
		teacher = input.nextDouble();
		
		//Calculation
		
		average = ((lab * .2) + (read * .1) + (video *.1) + (midterm *.2) + (proj * .15) + (fin *.2) + (teacher* .05));
	 
		//Average
		System.out.print("Your average is " + average + "%");
	 
	}

}
