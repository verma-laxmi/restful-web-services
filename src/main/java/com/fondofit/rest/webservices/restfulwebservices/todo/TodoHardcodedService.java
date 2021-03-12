package com.fondofit.rest.webservices.restfulwebservices.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {

	@Autowired
	TodoRepository todoRepository;

	public List<Todo> findAll() {
		return todoRepository.findAll();
	}
	
	public void deleteById(long id) {
		todoRepository.deleteById(id);
	}

	public Optional<Todo> findById(long id) {
		return todoRepository.findById(id);
	}
	
	public Todo save(Todo todo) {
		return todoRepository.save(todo);
	}
}
