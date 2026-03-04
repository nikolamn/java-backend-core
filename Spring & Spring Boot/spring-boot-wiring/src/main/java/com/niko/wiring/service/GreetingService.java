package com.niko.wiring.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.niko.wiring.properties.GreetingProperties;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.NotNull;

// injecting properties bean
@Service
public class GreetingService {
	
	private final GreetingProperties properties;
	private final Validator validator;
	
	public GreetingService(GreetingProperties properties, Validator validator) {
		this.properties = properties;
		this.validator = validator;
	}

	public String greet(String name) {
		Set<ConstraintViolation<GreetingRequest>> violations = validator.validate(new GreetingRequest(name));
		
		if (!violations.isEmpty()) return "Invalid name";
		
		return properties.getPrefix() + ", " + name;
	}
	
	// record used as dto for validation; auto validated by injected Validator 
	private record GreetingRequest(@NotNull String name) {}
}
