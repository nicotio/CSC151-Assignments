package guiString;
import java.util.Random;
import javax.swing.*;

public class ChooseOperation {

	public static void main(String[] args){
		
		//Open GUI
		WidgetView wv = new WidgetView();
		
		Random rand = new Random();
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		
		//J Label
		JLabel jl = new JLabel("Your numbers are x = " + x + " and y = " + y + ".");
		wv.add(jl);
		JLabel jl1 = new JLabel("Enter the operation number.");
		wv.add(jl1);
		
		JTextField jtf = new JTextField(5);
		wv.add(jtf);
		
		JButton jb = new JButton("Press here when you have entered the operation");
		wv.add(jb);
		wv.addAndWait(jb);
		
		String answer = jtf.getText();
		int sleep = Integer.parseInt(answer);
		if (sleep <= 10)
		{
			int yay = x + y;
			JLabel san = new JLabel("The answer is " + yay);
			wv.add(san);
		}
		
		else if (sleep % 4 == 0)
		{
			int yay = y - x ;
			JLabel san = new JLabel ("The answer is " + yay);
			wv.add(san);
		}
		
		else if (sleep % 5 == 0)
		{
			int yay = y/x;
			JLabel san = new JLabel("The answer is " + yay);
			wv.add(san);
		}
		
		else if (sleep%2 == 0)
		{
			float yay = (float)x + y;
			JLabel san = new JLabel("The answer is " + yay);
			wv.add(san);
		}
		else 
		{
			int yay = x * y;
			JLabel san = new JLabel("The answer is " + yay);
			wv.add(san);
		}

}
}
