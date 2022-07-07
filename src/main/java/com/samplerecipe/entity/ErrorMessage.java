package com.samplerecipe.entity;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

	
	private HttpStatus httpstatus;
	
	private String message;

	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}

	
	public String getMessage() {
		return message;
	}

	
	public void setMessage(String message) {
		this.message = message;
	}
	
	

	public ErrorMessage() {
		super();
	}

	public ErrorMessage(HttpStatus httpstatus, String message) {
		super();
		this.httpstatus = httpstatus;
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorMessage [httpstatus=" + httpstatus + ", message=" + message + "]";
	}
	
	
}
