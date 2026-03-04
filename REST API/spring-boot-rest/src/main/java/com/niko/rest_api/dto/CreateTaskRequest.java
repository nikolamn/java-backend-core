package com.niko.rest_api.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CreateTaskRequest {

	@NotBlank
	private String title;
	
	@Future
	private LocalDate dueDate;
}
