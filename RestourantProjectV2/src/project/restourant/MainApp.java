package project.restourant;

import javax.swing.SwingUtilities;

import project.restourant.controller.view.ModelViewController;
import project.restourant.view.LoginView.LogInFrame;

public class MainApp {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runApp();
			}
		});
	}

	/*
	 * runApp()
	 * 
	 * Create starting frame and add two listeners to log in frame. All controls
	 * between the frames are done through the ModelViewController.
	 */
	public static void runApp() {
		LogInFrame logInFrame = new LogInFrame();
		logInFrame.setVisible(true);

		ModelViewController modelViewController = new ModelViewController(logInFrame);

		logInFrame.setNewEmmployeeFrameListener(modelViewController);
		logInFrame.setLogInListener(modelViewController);
	}
}
