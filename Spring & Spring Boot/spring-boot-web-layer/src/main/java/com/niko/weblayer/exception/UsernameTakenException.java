package com.niko.weblayer.exception;

public class UsernameTakenException extends RuntimeException {
	public UsernameTakenException(String errorMessage) {
		super(errorMessage);
	}
}
