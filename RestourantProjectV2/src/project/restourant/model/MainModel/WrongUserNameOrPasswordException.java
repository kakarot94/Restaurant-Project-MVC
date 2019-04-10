package project.restourant.model.MainModel;

public class WrongUserNameOrPasswordException extends Exception {
	private String message;

	public WrongUserNameOrPasswordException(String message) {
		this.message = message;
	}

	public String toString() {
		return "Wrong " + message + "!";
	}
}
