package com.samplerecipe.exceptions;

public class NoRecipeFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	public NoRecipeFoundException() {
	super();
	}

	 public NoRecipeFoundException(String message) {
	super(message);
	}
	public NoRecipeFoundException(String message, Throwable cause) {
	super(message, cause);
	}
	public NoRecipeFoundException(Throwable cause) {
	super(cause);
	}

}
