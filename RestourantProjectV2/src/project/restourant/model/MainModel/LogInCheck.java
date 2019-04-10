package project.restourant.model.MainModel;
//WrongUserNameOrPasswordException -> WUNOPException!

/*
 * This class checks whether a entered log in data exists in the database.
 * If userName is incorrect then WUNOPException is thrown.
 * If password is incorrect then WUNOPException is thrown.
 * 
 * If everything is good, nothing is done.
 */
public class LogInCheck {
	private String userName = "admin";
	private String password = "admin";

	public void logInCheck(String userName, String password) throws WrongUserNameOrPasswordException {
		if (!this.userName.equals(userName)) {
			throw new WrongUserNameOrPasswordException("user name");
		} else if (!this.password.equals(password)) {
			throw new WrongUserNameOrPasswordException("password");
		}
	}
}
