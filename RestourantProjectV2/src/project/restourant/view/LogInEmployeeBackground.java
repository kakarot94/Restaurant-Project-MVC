package project.restourant.view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * This is a JLabel used for setting background for LogInFrame and NewEmployeeFrame.
 */
public class LogInEmployeeBackground extends JLabel {

	public LogInEmployeeBackground() {
		super();
		ImageIcon background = new ImageIcon(LogInEmployeeBackground.class.getResource("/images/LogInBackground.jpeg"));
		setIcon(background);
		setBounds(0, 0, 300, 400);
	}
}
