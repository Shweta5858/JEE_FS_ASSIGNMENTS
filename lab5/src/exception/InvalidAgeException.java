package exception;

public class InvalidAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientBalanaceException object without error message
	 */
	public InvalidAgeException() {
		super();
	}
	/**
	 * Create InsufficientBalanaceException object with error message
	 */
	public InvalidAgeException(String errMsg){
		super(errMsg);
	}
}
