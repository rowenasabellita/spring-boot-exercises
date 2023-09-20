package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    public Todo createTodo(Todo todo) {
        repository.save(todo);
        return todo;
    }

    public Todo updateTodo(Todo todo) {
        repository.save(todo);
        return todo;
    }

    public List<Todo> findAll() {
        return repository.findAll();
    }

    public void deleteTodo(String id) {
        repository.deleteById(id);
    }

}
