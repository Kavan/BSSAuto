package net.mylearnings.bssauto.Exceptions;

public class LocatorException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3979115040542424409L;

	public LocatorException() {
		super("An unknown Locator Exception has been thrown");
	}
	
	public LocatorException(String message){
		super(message);		
	}
	
	public LocatorException(Throwable cause){
		super(cause);
	}

}
