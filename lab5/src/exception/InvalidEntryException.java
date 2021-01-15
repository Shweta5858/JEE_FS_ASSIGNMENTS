package exception;

public class InvalidEntryException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientBalanaceException object without error message
	 */
	public InvalidEntryException() {
		super();
	}
	/**
	 * Create InsufficientBalanaceException object with error message
	 */
	public InvalidEntryException(String errMsg){
		super(errMsg);
	}

}
