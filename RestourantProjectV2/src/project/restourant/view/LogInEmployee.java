package project.restourant.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/*
 * This class is a superclass for classes LogInFrame and NewEmployeeFrame.
 * 
 * This class contains header and footer for subclass frames.
 */
public class LogInEmployee extends JFrame {

	private static final long serialVersionUID = 3L;

	protected JPanel contentPane = new JPanel();
	private JLabel copyRightLabel = new JLabel("\u00A9 2018");
	private JLabel restourantNameLabel = new JLabel("RESTOURANT NAME");
	private JLabel firmNameLabel = new JLabel("Kakarot IT Corporation");

	public LogInEmployee() {

		// Setting basic arguments for this JFrame.
		setSize(new Dimension(300, 400));
		setResizable(false);
		setLocation(535, 165);
		setFont(new Font("Impact", Font.PLAIN, 12));
		setTitle("RESTOURANT NAME");

		URL iconPath = LogInEmployee.class.getResource("/images/Icon.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage(iconPath));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Setting content pane with header and footer.
		contentPane.setSize(new Dimension(300, 500));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Header for LogInFrame and NewEmployeeFrame.
		restourantNameLabel.setForeground(new Color(0, 255, 255));
		restourantNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		restourantNameLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		restourantNameLabel.setBounds(0, 28, 294, 27);
		contentPane.add(restourantNameLabel);

		// Footer for LogInFrame and NewEmployeeFrame.
		copyRightLabel.setForeground(new Color(255, 255, 255));
		copyRightLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		copyRightLabel.setBounds(10, 346, 48, 14);
		contentPane.add(copyRightLabel);

		firmNameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		firmNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		firmNameLabel.setForeground(new Color(255, 255, 255));
		firmNameLabel.setBounds(163, 346, 121, 14);
		contentPane.add(firmNameLabel);
	}
}
