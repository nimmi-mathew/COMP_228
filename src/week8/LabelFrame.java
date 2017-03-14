package week8;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame{
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	
	public LabelFrame(){
		super("Label Test"); // Title bar string
		setLayout(new FlowLayout()); // sets the layout of the window
		
		label1 = new JLabel("My Label"); // initialize JLabel with text
		label1.setToolTipText("This is label1"); // Add a tooltip to label
		add(label1);
		
		Icon bug =  new ImageIcon("Images/bug1.png");
		label2 = new JLabel("Label with Text and Icon", bug, SwingConstants.LEFT);
		label2.setToolTipText("This is label2"); //Add a tooltip to label
		add(label2);

		
		label3 = new JLabel();
		label3.setText("Label with Text and Icon at the bottom");
		label3.setIcon(bug);
		label3.setToolTipText("This is label2"); // Add a tooltip to label
		add(label3);
		
	}
	

}
