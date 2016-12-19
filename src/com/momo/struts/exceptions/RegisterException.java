package com.momo.struts.exceptions;

@SuppressWarnings("serial")
public class RegisterException extends RuntimeException {

	public RegisterException() {
		super();
	}

	public RegisterException(String message) {
		super(message);
	}

}
