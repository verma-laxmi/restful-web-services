package com.fondofit.rest.webservices.restfulwebservices.todo;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoResource {
	
	@Autowired
	private TodoHardcodedService todoHardcodedService;
	

	@GetMapping("/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username){
		return todoHardcodedService.findAll();
	}
	
	@GetMapping("/users/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable long id){
		Optional<Todo> todo = todoHardcodedService.findById(id);
		if(todo.isPresent()) {
			return todo.get();
		}
		return null;
	}
	
	@PutMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable String username,
			@PathVariable long id, @RequestBody Todo todo){
		Todo todoUpdated = todoHardcodedService.save(todo);
		return new ResponseEntity<Todo>(todoUpdated, HttpStatus.OK);
	
	}
	
	@PostMapping("/users/{username}/todos")
	public ResponseEntity<Todo> saveTodo(@PathVariable String username, @RequestBody Todo todo){
		Todo todoUpdated = todoHardcodedService.save(todo);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(todoUpdated).toUri();
		
		return ResponseEntity.created(uri).build();
	
	}
	
	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username,
			@PathVariable long id){
		todoHardcodedService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
