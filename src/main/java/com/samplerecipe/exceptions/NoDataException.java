package com.samplerecipe.exceptions;

public class NoDataException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	 public NoDataException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoDataException(String message) {
	super(message);
	}
	public NoDataException(String message, Throwable cause) {
	super(message, cause);
	}
	public NoDataException(Throwable cause) {
	super(cause);
	}

}
