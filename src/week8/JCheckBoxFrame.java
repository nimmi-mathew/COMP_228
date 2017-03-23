package week8;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JCheckBoxFrame extends JFrame{
	private final JTextField textField;
	private final JCheckBox boldJCheckBox;
	private final JCheckBox italicJCheckBox;

	public JCheckBoxFrame(){
		super("JCheckBox Frame");
		setLayout(new FlowLayout());
		
		// TextField
		textField = new JTextField("Your Text", 20);
		textField.setFont(new Font("San Serif", Font.PLAIN, 14));
		add(textField);
		
		//checkBox
		boldJCheckBox = new JCheckBox("Bold");
		italicJCheckBox = new JCheckBox("Italic");
		add(boldJCheckBox);
		add(italicJCheckBox);
		
		// Register GUI element events
		CheckBoxHandler handler = new CheckBoxHandler();
		boldJCheckBox.addItemListener(handler);
		italicJCheckBox.addItemListener(handler);
	}

	private class CheckBoxHandler implements ItemListener{
		 
		private Font font= null;
		@Override
		public void itemStateChanged(ItemEvent e){
			if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected()){
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}
			else if(boldJCheckBox.isSelected()){
				font = new Font("Serif", Font.BOLD, 14);
			}
			else if(italicJCheckBox.isSelected()){
				font = new Font("Serif", Font.ITALIC, 14);
			}
			else{
				font = new Font("Serif", Font.PLAIN, 14);
			}
			
			textField.setFont(font);
		}
		
	}
}
