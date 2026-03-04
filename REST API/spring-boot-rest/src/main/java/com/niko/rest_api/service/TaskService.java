package com.niko.rest_api.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niko.rest_api.dto.CreateTaskRequest;
import com.niko.rest_api.dto.TaskResponse;
import com.niko.rest_api.model.Task;
import com.niko.rest_api.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {

	private final TaskRepository repository;

	@Transactional
	public TaskResponse create(CreateTaskRequest req) {
		repository.save(new Task(req.getTitle(), req.getDueDate()));

		return new TaskResponse(req.getTitle(), req.getDueDate());
	}

	@Transactional(readOnly = true)
	public List<TaskResponse> getAll() {
		List<Task> tasks = repository.findAll();

		return tasks.stream().map(task -> new TaskResponse(task.getTitle(), task.getDueDate())).toList();
	}
}
