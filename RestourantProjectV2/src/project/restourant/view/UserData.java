package project.restourant.view;

/*
 * This is a storage for user data. Object of this class is cast between view and controller so
 * that model can check whether data is accurate.
 * 
 * It contains four variables: userName, Password, checkPassword; and four getters for those variables.
 * Also, it contains two constructors, one for checking log in data, and one for checking
 * new employee data.
 */
public class UserData {
	private String userName;
	private String password;
	private String checkPassword;
	private String name;

	// constructor for checking log in data.
	public UserData(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// constructor for checking new employee data.
	public UserData(String name, String userName, String password, String checkPassword) {
		this.userName = userName;
		this.password = password;
		this.checkPassword = checkPassword;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getCheckPassword() {
		return checkPassword;
	}

}
