package com.niko.rest_api.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TaskResponse {

	private final String title;
	private final LocalDate dueDate;
}
