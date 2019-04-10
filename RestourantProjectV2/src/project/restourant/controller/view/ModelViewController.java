package project.restourant.controller.view;

import javax.swing.JOptionPane;

import project.restourant.model.MainModel.LogInCheck;
import project.restourant.model.MainModel.NewEmployeeCheck;
import project.restourant.model.MainModel.WrongUserNameOrPasswordException;
import project.restourant.view.UserData;
import project.restourant.view.LoginView.LogInFrame;
import project.restourant.view.LoginView.LogInListener;
import project.restourant.view.MainView.MainFrame;

/*
 * This class is a subclass of class ViewController!
 * 
 * This class and it's superclass is used for sending commands given by
 * frames or by model to model or frame.
 */
public class ModelViewController extends ViewController implements LogInListener {
	private LogInCheck logInCheck = new LogInCheck();
	private NewEmployeeCheck newEmployeeCheck = new NewEmployeeCheck();

	public ModelViewController(LogInFrame logInFrame) {
		super(logInFrame); // Calls constructor for the superclass to start
	} 					   // monitoring for instructions.

	/*
	 * logInButtonPerformed()
	 * 
	 * Calls log in check method logInCheck. This method checks user data(user name and password). 
	 * 		(logInCheck throws an exception. For more detailed explanation
	 * 		 see @project.restourant.model.MainModel/LogInCheck) 
	 * If data is right openMainFrame method is called to open main frame. After that method
	 * whoIsFocused is called to close log in frame.
	 */
	public void logInButtonPerformed(UserData userData) {
		try {
			logInCheck.logInCheck(userData.getUserName(), userData.getPassword());
			openMainFrame();
			whoIsFocused();
		} catch (WrongUserNameOrPasswordException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
		}
	}

	/*
	 * createNewEmployeePerformed()
	 * 
	 * Calls new employee check method newEmployeeCheck to check and add user to data base. 
	 * 		(newEmplyeeCheck throws an exception. For more detailed explanation 
	 * 		 see @project.restourant.model.MainModel/NewEmployeeCheck) 
	 * If user is added logInFrame method is called to open log in frame. After that method
	 * whoIsFocused is called to close new employee frame.
	 */
	public void createNewEmployeePerformed(UserData userData) {
		try {
			newEmployeeCheck.newEmployeeCheck(userData.getName(), userData.getUserName(), userData.getPassword(),
					userData.getCheckPassword());
			openLogInFrame();
			whoIsFocused();
		} catch (WrongUserNameOrPasswordException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "", JOptionPane.ERROR_MESSAGE);
		}
	}

	/*
	 * openMainFrame()
	 * 
	 * If main frame is called for the first time, new MainFrame is created. If not,
	 * main frame will be set to visible.
	 */
	protected void openMainFrame() {
		if (mainFrame == null) {
			mainFrame = new MainFrame();
			mainFrame.setVisible(true);
		} else {
			mainFrame.setVisible(true);
		}
	}
}
