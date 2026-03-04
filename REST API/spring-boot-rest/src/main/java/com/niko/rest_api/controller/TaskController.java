package com.niko.rest_api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niko.rest_api.dto.CreateTaskRequest;
import com.niko.rest_api.dto.TaskResponse;
import com.niko.rest_api.service.TaskService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/task")
public class TaskController {

	private final TaskService taskService;
	
	@PostMapping("/new")
	public ResponseEntity<TaskResponse> createNewTask(@RequestBody @Valid CreateTaskRequest request) {
		TaskResponse dto = taskService.create(request);

		return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<TaskResponse>> getAllTasks() {
		List<TaskResponse> response = taskService.getAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
