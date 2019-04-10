package project.restourant.view.LoginView;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import project.restourant.view.LogInEmployee;
import project.restourant.view.LogInEmployeeBackground;
import project.restourant.view.UserData;

/*
 * This class is a subclass of class LogInEmployee.
 * 
 * This is the log in frame. It is used for log in users.
 * Frame contain two JTextFields, two JButtons and two JLabels.
 */
public class LogInFrame extends LogInEmployee {
	private JLabel userNameLabel;
	private JLabel passwordLabel;
	private JButton logInButton;
	private JButton newEmployeeButton;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private LogInEmployeeBackground logInBackground; // This class contains JLabel for background

	private NewEmployeeFrameListener newEmployeeListener;
	private LogInListener logInListener;

	private UserData UserData;

	public LogInFrame() {

		// -----CONSTRUCTORS FOR COMMPONENTS WITH BASIC INFORMATIONS LIKE BOUNDS, FONTS,
		// CORLOR ETC-----
		userNameField = new JTextField();
		userNameField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		userNameField.setBounds(80, 90, 140, 25);
		contentPane.add(userNameField);

		userNameLabel = new JLabel("USER NAME");
		userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userNameLabel.setForeground(new Color(255, 255, 255));
		userNameLabel.setFont(new Font("Sitka Subheading", Font.ITALIC, 13));
		userNameLabel.setBounds(80, 120, 140, 15);
		contentPane.add(userNameLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(80, 149, 140, 25);
		contentPane.add(passwordField);

		passwordLabel = new JLabel("PASSWORD");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font("Sitka Subheading", Font.ITALIC, 13));
		passwordLabel.setBounds(80, 180, 140, 15);
		contentPane.add(passwordLabel);

		logInButton = new JButton("LOG IN"); // -----Opens MainFrame-----
		logInButton.setVerticalAlignment(SwingConstants.TOP);
		logInButton.setHorizontalTextPosition(SwingConstants.CENTER);
		logInButton.setBorderPainted(false);
		logInButton.setForeground(new Color(0, 0, 0));
		logInButton.setBackground(new Color(160, 255, 255));
		logInButton.setFont(new Font("Sitka Subheading", Font.ITALIC, 12));
		logInButton.setBounds(110, 220, 80, 20);
		contentPane.add(logInButton);

		logInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fireLogInButtonEvent();
			}
		});

		newEmployeeButton = new JButton("NEW"); // -----Opens NewEmployeeFrame-----
		newEmployeeButton.setVerticalAlignment(SwingConstants.TOP);
		newEmployeeButton.setHorizontalTextPosition(SwingConstants.CENTER);
		newEmployeeButton.setBorderPainted(false);
		newEmployeeButton.setForeground(new Color(0, 0, 0));
		newEmployeeButton.setBackground(new Color(160, 255, 255));
		newEmployeeButton.setFont(new Font("Sitka Subheading", Font.ITALIC, 12));
		newEmployeeButton.setBounds(110, 250, 80, 20);
		contentPane.add(newEmployeeButton);

		newEmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fireNewEmployeeEvent();
			}
		});

		// -----LogInEmployeeBackground is used for setting up a background image-----
		logInBackground = new LogInEmployeeBackground();
		contentPane.add(logInBackground);

	}

	// This method sets the listener for newEmployeeButton [line:92]
	public void setNewEmmployeeFrameListener(NewEmployeeFrameListener newEmployeeListener) {
		this.newEmployeeListener = newEmployeeListener;
	}

	// When button is clicked, this method will first check is someone listening.
	// If true, the signal is sent that button is clicked
	private void fireNewEmployeeEvent() {
		if (newEmployeeListener != null) {
			newEmployeeListener.newEmployeeButtonPerformed();
		}
	}

	// This method sets the listener for newEmployeeButton [line:74]
	public void setLogInListener(LogInListener logInListener) {
		this.logInListener = logInListener;
	}

	// When button is clicked, this method will first check is someone listening.
	// If true, the signal with userData is sent that button is clicked
	public void fireLogInButtonEvent() {
		if (logInListener != null) {
			logInListener.logInButtonPerformed(
					new UserData(userNameField.getText(), new String(passwordField.getPassword())));
		}
	}
}
