package com.example.security.Todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/authorized/")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping
    public List<Todo> getTodos() {
        return service.findAll();
    }

    @PostMapping
    public void addTodo(@RequestBody Todo todo) {
         service.addTodo(todo);
    }

    @PutMapping("{id}")
    public void updateTodo(@PathVariable("id") String id, @RequestBody Todo todo) {
         service.updateTodo(id,todo);
    }

    @DeleteMapping("{id}")
    public void deleteTodo(@PathVariable("id") String id) {
         service.deleteTodo(id);
    }
}
