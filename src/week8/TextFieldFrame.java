package week8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
	// Variable Declaration
	private final JTextField textField1;
	private final JTextField textField2;
	private final JTextField textField3;
	private final JPasswordField password;

	// Constructor
	public TextFieldFrame() {
		super("Frame with Text Fields");
		setLayout(new FlowLayout());

		// textfield1
		textField1 = new JTextField(10); // 10 character width
		add(textField1);

		// textfield2
		textField2 = new JTextField("Enter text here"); // Default text
		add(textField2);

		// textfield3
		textField3 = new JTextField("Uneditable field", 21);
		textField3.setEditable(false);
		add(textField3);

		// passwordField
		password = new JPasswordField("Hidden Text");
		add(password);

		// Adding action listeners
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		password.addActionListener(handler);
	}

	private class TextFieldHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = "";
			if (e.getSource() == textField1) {
				str = String.format("textField1: %s", e.getActionCommand());
			} else if (e.getSource() == textField2) {
				str = String.format("textField2: %s", e.getActionCommand());
			} else if (e.getSource() == textField3) {
				str = String.format("textField3: %s", e.getActionCommand());
			} else if (e.getSource() == password) {
				str = String.format("passwordField: %s", e.getActionCommand());
			}
			JOptionPane.showMessageDialog(null, str);
		}
	}
}
