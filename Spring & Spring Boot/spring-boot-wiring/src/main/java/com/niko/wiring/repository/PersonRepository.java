package com.niko.wiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niko.wiring.model.Person;

public interface  PersonRepository extends JpaRepository<Person, Long> {}
