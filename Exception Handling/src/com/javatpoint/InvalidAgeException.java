package com.javatpoint;

public class InvalidAgeException extends Throwable {

	private static final long serialVersionUID = -7442173444596326727L;

	public InvalidAgeException(String s) {
		super(s);
	}

}
