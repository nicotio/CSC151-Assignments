package guiString;
import javax.swing.*;

public class GuiString {
	public static void main (String[] args)
	{
		//Open GUI
		WidgetView wv = new WidgetView();
		
		//TextFields
		JTextField jtf1 = new JTextField(20);
		JTextField jtf2 = new JTextField("Initial Velocity");
		JTextField jtf3 = new JTextField("Final Velocity");
		
		
		//FIELD'S CONTENT
		jtf1.setText("Physic is love");
		
		//BUTTONS
	//	JButton jb = new JButton("Physic Test 1");
		JButton jb = new JButton("print Physic is Love");
		
		//TELL TEXT OF FIELD TO ADD TO GUI
		wv.add(jtf1);
		wv.add(jtf2);
		
		//BUTTONS ADD TO GUI
		wv.add(jb);
		
		//add and wait
		wv.addAndWait(jtf3);
		
		//CONSOLE
		System.out.println("Test 1 Rdy");
		
		//GET TEXT
		String s = jtf1.getText();
		System.out.println(s);
		
		//
		
		String change = jtf3.getText();
		System.out.println("got: " + change);
		
		JTextField jtf4 = new JTextField("the textfield is now " + change);
		
		//ADD GUI
		wv.add(jtf4);
		
		
	}

}
