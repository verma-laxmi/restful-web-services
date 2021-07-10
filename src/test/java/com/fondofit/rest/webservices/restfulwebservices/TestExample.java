package com.fondofit.rest.webservices.restfulwebservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.fondofit.rest.webservices.restfulwebservices.todo.Todo;

public class TestExample {

	@Test
	public void testSample() {
		Todo todo = new Todo(1, "username", "desc", new Date(), false);
		todo.getId();
		todo.getDescription();
		assertEquals("test", "test");
	}
}
