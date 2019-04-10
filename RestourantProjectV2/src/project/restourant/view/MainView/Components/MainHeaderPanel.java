package project.restourant.view.MainView.Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import project.restourant.view.BackToLogInListener;

// This is header panel for main frame.
public class MainHeaderPanel extends JPanel {

	private JLabel restourantNameLabel;
	private JLabel timeLabel;
	private JLabel dateLabel;
	private JLabel userNameLabel;
	private JButton helpButton;
	private JButton logOutButton;
	protected BackToLogInListener backToLogInListener;

	public MainHeaderPanel() {

		// Setting basic parameters for this panel.
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

		timeLabel = new JLabel("Time");
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		timeLabel.setBounds(10, 10, 100, 30);
		add(timeLabel);

		dateLabel = new JLabel("Date");
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dateLabel.setBounds(10, 40, 100, 30);
		add(dateLabel);

		restourantNameLabel = new JLabel("RESTOURANT NAME");
		restourantNameLabel.setForeground(Color.BLUE);
		restourantNameLabel.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 40));
		restourantNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		restourantNameLabel.setBounds(290, 10, 790, 60);
		add(restourantNameLabel);

		userNameLabel = new JLabel("Igor Stojanovic");
		userNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		userNameLabel
				.setBorder(new TitledBorder(null, "USER NAME", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userNameLabel.setBounds(1200, 10, 150, 35);
		add(userNameLabel);

		logOutButton = new JButton("Log Out"); // -----Opens LogInFrame-----
		logOutButton.setBounds(1200, 45, 110, 25);
		add(logOutButton);
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fireLogOutPerformed();
			}
		});

		helpButton = new JButton("?"); // -----Opens help menu-----
		helpButton.setBounds(1310, 45, 40, 25);
		add(helpButton);
	}

	// This method sets the listener for newEmployeeButton [line:55]
	public void setBackToLogInFrameListener(BackToLogInListener backToLogInListener) {
		this.backToLogInListener = backToLogInListener;
	}

	// When button is clicked, this method will first check is someone listening.
	// If true, the signal is sent that button is clicked
	public void fireLogOutPerformed() {
		if (backToLogInListener != null) {
			backToLogInListener.logOutPerformed();
		}
	}
}
