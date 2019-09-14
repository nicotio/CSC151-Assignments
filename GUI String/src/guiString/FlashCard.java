package guiString;
import java.util.Random;
import javax.swing.*;

public class FlashCard {
	public static void main(String[] args){
		
		//Open GUI
		WidgetView wv = new WidgetView();
		
		Random rand = new Random();
		int s = rand.nextInt(10);
		int sl = rand.nextInt(10);
		int sleep = s * sl;
		
		//Label
		JLabel jl = new JLabel("What is " + s +" times " + sl +"?");
		JLabel jl1 = new JLabel("Good Job, your answer is correct");
		JLabel jl2 = new JLabel("Sorry, the correct answer is " + sleep);
		
		
		//JTextField
		JTextField jtf = new JTextField(10);
		
		//J button
		JButton jb = new JButton("Click when your answer is ready");
		
		//Show
		wv.add(jl);
		wv.add(jtf);
		
		wv.add(jb);
		wv.addAndWait(jb);
		
		String answer = jtf.getText();
		int human = Integer.parseInt(answer);
		
		if (human == sleep)
		{wv.add(jl1);}
		
		else
		{wv.add(jl2);}
		
		
		
		
		
	}

}
