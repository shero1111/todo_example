package com.examples.demo.todo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.examples.demo.todo.enums.Status;

import lombok.Data;

@Data
@Document(collection = "TodoItem")
public class TodoItem {
	
	@Id
	private String id;
	private String title;
	private Status status;
}
