package com.example.demo.common;

import java.util.Locale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class EndpointErrorHandler {
	  private static final String UNEXPECTED_ERROR = "Exception.unexpected";
	  private final MessageSource messageSource;
	  
	@Autowired  
	public EndpointErrorHandler(MessageSource messageSource) {
		super();
		this.messageSource = messageSource;
	}
	
	@ExceptionHandler(InvalidUserException.class)
	  public ResponseEntity<ErrorInfo> handleInvalidUsertException(HttpServletRequest request,
			  InvalidUserException ex, Locale locale) {
		ErrorInfo response = new ErrorInfo();
		response.setUrl(request.getRequestURL().toString());
		response.setMessage(messageSource.getMessage(ex.getMessage(), ex.getArgs(), locale));
		return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
	  }
	
	@ExceptionHandler(BookNotFoundException.class)
	  public ResponseEntity<ErrorInfo> handleBookNotFoundException(HttpServletRequest request,
			  BookNotFoundException ex, Locale locale) {
		ErrorInfo response = new ErrorInfo();
		response.setUrl(request.getRequestURL().toString());
		response.setMessage(messageSource.getMessage(ex.getMessage(), ex.getArgs(), locale));
		return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
	  }
	
	@ExceptionHandler(BookNotAvailableException.class)
	  public ResponseEntity<ErrorInfo> handleBookNotAvailableException(HttpServletRequest request,
			  BookNotAvailableException ex, Locale locale) {
		ErrorInfo response = new ErrorInfo();
		response.setUrl(request.getRequestURL().toString());
		response.setMessage(messageSource.getMessage(ex.getMessage(), ex.getArgs(), locale));
		return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
	  }
	
	@ExceptionHandler(Exception.class)
	  public ResponseEntity<ErrorInfo> handleException(Exception ex, Locale locale) {
		String errorMessage = messageSource.getMessage(UNEXPECTED_ERROR, null, locale);
		return new ResponseEntity<>(new ErrorInfo(errorMessage), HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	  
	
}
