package com.daimler.exception;

public class MyCustomException extends Exception{
 private String message;

public MyCustomException(String message) {
	super(message);
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

 
}
