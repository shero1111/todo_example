package com.examples.demo.todo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.examples.demo.todo.model.TodoItem;

public interface TodoItemRepository extends MongoRepository<TodoItem, Long>{

	
}
