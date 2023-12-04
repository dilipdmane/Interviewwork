package com.example.demo.common;
public class BookNotFoundException extends Exception {

	private static final long serialVersionUID = 8890080495441147845L;
	
	private String message;
	private Object[] args;
	
	public BookNotFoundException(String message, Object[] args) {
		super();
		this.message = message;
		this.args = args;
	}

	public BookNotFoundException(String message) {
		this.message = String.format("Book - %s  is not found", message);
	}
	
	public BookNotFoundException(Object[] args) {
		this.args = args;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}
	
	

}