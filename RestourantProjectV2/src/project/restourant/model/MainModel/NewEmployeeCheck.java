package project.restourant.model.MainModel;

/*
 * This class checks whether a new worker exists in the database.
 * First method newEmployeeCheck is called. This method checks if entered password and check password are equal.
 * If false, WrongUserNameOrPasswordException is thrown.
 * If true, method addNewEmployee is called.
 */
public class NewEmployeeCheck {

	public void newEmployeeCheck(String name, String userName, String password, String checkPassword)
			throws WrongUserNameOrPasswordException {
		if (password.equals(checkPassword)) {
			addNewEmployee(name, userName, password);
		} else {
			throw new WrongUserNameOrPasswordException("password!");
		}
	}

	private void addNewEmployee(String name, String userName, String password) throws WrongUserNameOrPasswordException {
		// upcoming!
	}
}
