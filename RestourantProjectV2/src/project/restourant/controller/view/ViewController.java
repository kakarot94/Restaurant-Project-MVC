package project.restourant.controller.view;

import project.restourant.view.BackToLogInListener;
import project.restourant.view.LoginView.LogInFrame;
import project.restourant.view.LoginView.NewEmployeeFrameListener;
import project.restourant.view.MainView.MainFrame;
import project.restourant.view.NewEmmployeeView.NewEmployeeFrame;

/*
 * This class is a superclass for class ModelViewController.
 * This class and it's subclass is used for sending commands given by
 * frames or by model to model or frame.
 */
public class ViewController implements NewEmployeeFrameListener, BackToLogInListener {
	protected LogInFrame logInFrame;
	private NewEmployeeFrame newEmployeeFrame;
	protected MainFrame mainFrame;

	public ViewController(LogInFrame logInFrame) {
		this.logInFrame = logInFrame;
	}

	/*
	 * newEmployeeButtonPerformed()
	 * 
	 * Opens NewEmployeeFrame. [openNewEmployeeFrame()] 
	 * Closes LogInFrame. [whoIsFocused()]
	 */
	public void newEmployeeButtonPerformed() {
		openNewEmployeeFrame();
		whoIsFocused();
	}

	/*
	 * backToLogInButtonPerformed()
	 * 
	 * Opens LogInFrame. [openLogInFrame()] 
	 * Closes MainFrame or NewEmployeeFrame(depends on who is in focus()). [whoIsFocused()]
	 */
	public void backToLogInButtonPerformed() {
		openLogInFrame();
		whoIsFocused();
	}

	/*
	 * logOutPerformed()
	 * 
	 * Opens LogInFrame. [openLogInFrame()] 
	 * Closes MainFrame. [whoIsFocused()]
	 */
	public void logOutPerformed() {
		openLogInFrame();
		whoIsFocused();
	}

	/*
	 * openNewEmployeeFrame()
	 * 
	 * If opens NewEmployeeFrame for the first time, create new NewEmployeeFrame,
	 * else set newEmployeeFrame to visible.
	 */
	private void openNewEmployeeFrame() {
		if (newEmployeeFrame == null) {
			newEmployeeFrame = new NewEmployeeFrame();
			newEmployeeFrame.setVisible(true);
		} else {
			newEmployeeFrame.setVisible(true);
		}
	}

	/*
	 * openLogInFrame()
	 * 
	 * Sets logInFrame to visible.
	 */
	protected void openLogInFrame() {
		logInFrame.setVisible(true);
	}

	/*
	 * whoIsFocused()
	 * 
	 * Checks who is in the focus. The one in the focus need to be disposed.
	 */
	protected void whoIsFocused() {
		if (logInFrame.isFocused()) {
			if (newEmployeeFrame != null) {
				newEmployeeFrame.setBackToLogInFrameListener(this);
			}
			if (mainFrame != null) {
				mainFrame.setBackToLogInFrameListener(this);
			}
			logInFrame.dispose();
		} else if (newEmployeeFrame != null) {
			if (newEmployeeFrame.isFocused()) {
				newEmployeeFrame.dispose();
			}
		} else if (mainFrame != null) {
			if (mainFrame.isFocused()) {
				mainFrame.dispose();
			}
		}
	}
}
