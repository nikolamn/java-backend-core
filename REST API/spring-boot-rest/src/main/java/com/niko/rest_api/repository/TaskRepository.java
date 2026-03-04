package com.niko.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niko.rest_api.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{}
