package com.examples.demo.todo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examples.demo.todo.model.TodoItem;
import com.examples.demo.todo.repository.TodoItemRepository;


@RestController
public class TodoController {

	@Autowired
	private TodoItemRepository repository;
	
	@GetMapping("/todos")
	public List<TodoItem> getTodos(){
		return repository.findAll();
	}
	
	@GetMapping("/todo/{id}")
	public TodoItem getById(@PathVariable Long id){
		return repository.findById(id).get();
	}

	@PostMapping("/save")
	public void saveTodoItem(@RequestBody TodoItem item){
		repository.save(item);
	}


//	@PutMapping("/update")
//	public void update(@RequestBody TodoItem item){
//		repository.save(item);
//	}

	@PatchMapping("/update")
	public void update(@RequestBody TodoItem item){
		repository.save(item);
	}
}
