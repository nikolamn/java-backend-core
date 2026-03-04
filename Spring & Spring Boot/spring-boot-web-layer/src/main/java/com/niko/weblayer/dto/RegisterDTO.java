package com.niko.weblayer.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class RegisterDTO {

	@NotEmpty(message = "Username must not be empty")
	@Size(min = 8, max = 14, message = "Username must be between 8 and 14 charachters")
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
