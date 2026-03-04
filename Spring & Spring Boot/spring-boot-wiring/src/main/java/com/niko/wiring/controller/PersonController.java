package com.niko.wiring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niko.wiring.model.Person;
import com.niko.wiring.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

	private final PersonRepository repo;

	public PersonController(PersonRepository repo) {
		this.repo = repo;
	}

	@PostMapping("/new")
	public Person create(@RequestParam String name) {
		Person u = new Person();
		u.setName(name);
		return repo.save(u);
	}

	@GetMapping("/all")
	public List<Person> getAll() {
		return repo.findAll();
	}
}
