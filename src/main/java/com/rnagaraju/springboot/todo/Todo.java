package com.rnagaraju.springboot.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
	@Id
	private int id;
	private String username;
	
	@Size(min=10, max=20)
	private String description;
	private LocalDate dueDate;
	private boolean done;
//	private String priority;
//	private String category;
	
	public Todo(int id, String username, String description, LocalDate dueDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.dueDate = dueDate;
		this.done = done;
	}
	
	public Todo() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", dueDate=" + dueDate
				+ ", done=" + done + "]";
	}
	
}
