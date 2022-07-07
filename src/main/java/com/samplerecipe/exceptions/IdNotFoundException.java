package com.samplerecipe.exceptions;

public class IdNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	public IdNotFoundException() {
	super();
	}

	 public IdNotFoundException(String message) {
	super(message);
	}
	public IdNotFoundException(String message, Throwable cause) {
	super(message, cause);
	}
	public IdNotFoundException(Throwable cause) {
	super(cause);
	}

}
