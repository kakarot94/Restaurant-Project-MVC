package project.restourant.view.NewEmmployeeView;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import project.restourant.view.BackToLogInListener;
import project.restourant.view.LogInEmployee;
import project.restourant.view.LogInEmployeeBackground;
import project.restourant.view.UserData;

/*
 * This class is a subclass of class LogInEmployee.
 * 
 * This is the new employee frame. It is used for creating new users.
 * Frame contains four JLabels, two JTextFields, two JPasswordField, two JButtons.
 */
public class NewEmployeeFrame extends LogInEmployee {

	private JLabel userNameLabel = new JLabel("User name");
	private JLabel nameLabel = new JLabel("Name");
	private JLabel passwordLabel = new JLabel("Password");
	private JLabel checkPasswordLabel = new JLabel("Check password");
	private JTextField nameField = new JTextField();
	private JTextField userNameField = new JTextField();
	private JPasswordField passwordField = new JPasswordField();
	private JPasswordField checkPasswordField = new JPasswordField();
	private JButton newEmployeeButton = new JButton("New employee");
	private JButton returnToLogInButton = new JButton("Back");
	private LogInEmployeeBackground employeeBackground;

	private BackToLogInListener backToLogInListener;
	private CreateNewEmployeeListener createNewEmployeeListener;

	public NewEmployeeFrame() {

		// -----CONSTRUCTORS FOR COMMPONENTS WITH BASIC INFORMATIONS LIKE BOUNDS, FONTS,
		// CORLOR ETC-----
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nameLabel.setBounds(25, 106, 96, 14);
		contentPane.add(nameLabel);

		userNameLabel.setForeground(Color.WHITE);
		userNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		userNameLabel.setBounds(25, 131, 96, 14);
		contentPane.add(userNameLabel);

		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordLabel.setBounds(25, 156, 96, 14);
		contentPane.add(passwordLabel);

		checkPasswordLabel.setForeground(Color.WHITE);
		checkPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkPasswordLabel.setBounds(25, 181, 96, 14);
		contentPane.add(checkPasswordLabel);

		nameField.setBounds(141, 103, 120, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);

		userNameField.setColumns(10);
		userNameField.setBounds(141, 129, 120, 20);
		contentPane.add(userNameField);

		passwordField.setBounds(141, 154, 120, 20);
		contentPane.add(passwordField);

		checkPasswordField.setBounds(141, 179, 120, 20);
		contentPane.add(checkPasswordField);

		newEmployeeButton.setBorderPainted(false);
		newEmployeeButton.setForeground(new Color(0, 0, 0));
		newEmployeeButton.setBackground(new Color(160, 255, 255));
		newEmployeeButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		newEmployeeButton.setBounds(155, 238, 120, 23);
		contentPane.add(newEmployeeButton);

		returnToLogInButton.setForeground(Color.BLACK); // -----Opens LogInFrame-----
		returnToLogInButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		returnToLogInButton.setBorderPainted(false);
		returnToLogInButton.setBackground(new Color(160, 255, 255));
		returnToLogInButton.setBounds(20, 238, 120, 23);
		contentPane.add(returnToLogInButton);

		returnToLogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fireBackToLogInFrameEvent();
			}
		});

		// -----LogInEmployeeBackground is used for setting up a background image-----
		employeeBackground = new LogInEmployeeBackground();
		contentPane.add(employeeBackground);
	}

	// This method sets the listener for returnToLogInButton [line:92]
	public void setBackToLogInFrameListener(BackToLogInListener backToLogInListener) {
		this.backToLogInListener = backToLogInListener;
	}

	// When button is clicked, this method will first check is someone listening.
	// If true, the signal is sent that button is clicked
	private void fireBackToLogInFrameEvent() {
		if (backToLogInListener != null) {
			backToLogInListener.backToLogInButtonPerformed();
		}
	}

	// This method sets the listener for returnToLogInButton [line:92]
	public void setNewEmployeeListener(CreateNewEmployeeListener createNewEmployeeListener) {
		this.createNewEmployeeListener = createNewEmployeeListener;
	}

	// When button is clicked, this method will first check is someone listening.
	// If true, the signal with userData object is sent that button is clicked
	public void fireCreateNewEmployeeEvent() {
		if (createNewEmployeeListener != null) {
			String password = new String(passwordField.getPassword());
			String checkPassword = new String(checkPasswordField.getPassword());
			createNewEmployeeListener.createNewEmployeeListener(
					new UserData(nameField.getText(), userNameField.getText(), password, checkPassword));
		}
	}
}
