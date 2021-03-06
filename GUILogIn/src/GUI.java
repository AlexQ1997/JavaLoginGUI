import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		//creating the style for the input
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20 ,80, 25);
		panel.add(userLabel);
		
		//Text field
		 userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		//Creating Password 
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 35); // x,y, width, height
		panel.add(passwordLabel);
		
		//Field for inputing password 
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
		
		//Adding a button
		button = new JButton("Login");
		button.setBounds(10,80,80,25);
		//Adding action to button
		button.addActionListener(new GUI());
		panel.add(button);
		
		//Log in Actions
		//Success Label
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success); 
		
				
		
		frame.setVisible(true);
	}

	//Button is Tied to this message 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String user = userText.getText();
		String password  = passwordText.getText();
		System.out.println(user + ", " + password);
		
		if (user.equals("Alex")&& password.equals("Not_batman15") ) {
			success.setText("Login Successful!");
		}
		
	}
}
