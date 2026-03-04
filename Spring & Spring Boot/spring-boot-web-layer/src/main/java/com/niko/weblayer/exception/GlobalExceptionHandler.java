package com.niko.weblayer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UsernameTakenException.class)
	public ResponseEntity<String> handleConflict() {
		String response = "Username already taken";

		return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> handleInvalidFormat() {
		String response = "Wrong format";
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
}
