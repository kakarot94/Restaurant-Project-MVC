package project.restourant.view.MainView;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.IllegalComponentStateException;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import project.restourant.view.BackToLogInListener;
import project.restourant.view.LogInEmployee;
import project.restourant.view.MainView.Components.CentralPanel;
import project.restourant.view.MainView.Components.MainFooterPanel;
import project.restourant.view.MainView.Components.MainHeaderPanel;

/*
 * MainFrame 
 * 
 * This frame is the main frame of the application. User can access to this frame if he has
 * correct user name and password.
 * MainFrame is build from three JPanels:
 * 		-CentralPanel
 * 		-MainHeaderPanel
 * 		-MainFooterPanel 
 */
public class MainFrame extends JFrame {

	private MainHeaderPanel headerPanel;
	private CentralPanel centralPanel;
	private MainFooterPanel footerPanel;

	public MainFrame() {
		
		// Setting basic parameters for this frame.
		setTitle("RESTOURANT NAME");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(1370, 730);

		// Setting window icon and background
		setIconImage(Toolkit.getDefaultToolkit().getImage(LogInEmployee.class.getResource("/images/Icon.png")));

		try {
			setContentPane(new JLabel(new ImageIcon(MainFrame.class.getResource("/Images/MainFrameBeckground.jpeg"))));
		} catch (IllegalComponentStateException e) {
			System.out.println("Image doesn't exist");
		}

		setLayout(new BorderLayout());

		// Setting components for this frame
		footerPanel = new MainFooterPanel();
		footerPanel.setPreferredSize(new Dimension(1370, 20));
		add(footerPanel, BorderLayout.SOUTH);

		headerPanel = new MainHeaderPanel();
		headerPanel.setPreferredSize(new Dimension(1370, 80));
		add(headerPanel, BorderLayout.NORTH);

		centralPanel = new CentralPanel();
		centralPanel.setPreferredSize(new Dimension(1300, 600));
		add(centralPanel, BorderLayout.CENTER);

	}

	// This method cast listener to the header. The button for that listener is in
	// MainHeaderPanel on line[58]
	public void setBackToLogInFrameListener(BackToLogInListener backToLogInListener) {
		headerPanel.setBackToLogInFrameListener(backToLogInListener);
	}

}
