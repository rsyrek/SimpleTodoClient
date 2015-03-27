package main;

import java.util.List;

import client.TodoClient;
import entities.Todo;

public class Main {

	public static void main(String[] args) {
		TodoClient client = new TodoClient(); 
		//Todo todo = client.postForTodo("POST", true);
		//System.out.println(todo);
		//todo = client.postForTodo("POST2", true);
		//long id = todo.getId();
		//todo = client.getForTodo(id);
		//System.out.println(todo);
//		List<Todo> todos = client.getForTodos();
//		System.out.println(todos);
		client.deleteDoneTodo();
//		client.updateDoneTodo(113, false);
//		System.out.println("done");
//		todos = client.getForTodos();
//		System.out.println(todos);
		
    }
}