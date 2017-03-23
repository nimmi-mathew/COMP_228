package week8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
	private final JButton plainJButton;
	private final JButton fancyJButton;

	public ButtonFrame() {
		super("Button Frame test");
		setLayout(new FlowLayout());

		plainJButton = new JButton("plain JButton");
		add(plainJButton);

		Icon bug1 = new ImageIcon("Images/bug1.png");
		Icon bug2 = new ImageIcon("Images/bug2.gif");
		fancyJButton = new JButton("fancy JButton", bug1);
		fancyJButton.setRolloverIcon(bug2);
		add(fancyJButton);
		
		ButtonHandler handler = new ButtonHandler();
		plainJButton.addActionListener(handler);
		fancyJButton.addActionListener(handler);

	}

	private class ButtonHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("you pressed %s", e.getActionCommand()));

		}
	}

}
