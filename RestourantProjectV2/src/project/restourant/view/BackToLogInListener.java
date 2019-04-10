package project.restourant.view;

/*
 * Listens for returnToLogInButton in NewEmployeeFrame and logOutButton in MainFrame/MainHeaderPanel.
 */
public interface BackToLogInListener {
	public void backToLogInButtonPerformed();

	public void logOutPerformed();
}
