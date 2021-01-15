package exception;

public class InvalidNameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientBalanaceException object without error message
	 */
	public InvalidNameException() {
		super();
	}
	/**
	 * Create InsufficientBalanaceException object with error message
	 */
	public InvalidNameException(String errMsg){
		super(errMsg);
	}

}
