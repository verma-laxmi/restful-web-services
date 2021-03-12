package com.fondofit.rest.webservices.restfulwebservices;

public class AuthenticatedBean {

	private String message;

	public AuthenticatedBean(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "AuthenticatedBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
