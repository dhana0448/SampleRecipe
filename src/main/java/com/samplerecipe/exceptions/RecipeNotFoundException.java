package com.samplerecipe.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.samplerecipe.entity.ErrorMessage;

@ControllerAdvice
@ResponseStatus
public class RecipeNotFoundException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ErrorMessage> IdNotFoundException(IdNotFoundException ide, WebRequest request)
	{
		ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND, ide.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
	}

	@ExceptionHandler(NoDataException.class)
	public ResponseEntity<ErrorMessage> NoDataException(NoDataException ide, WebRequest request)
	{
		ErrorMessage message=new ErrorMessage(HttpStatus.BAD_REQUEST, ide.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
		
	}
	
}
