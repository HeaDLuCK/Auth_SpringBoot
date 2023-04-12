package com.example.security.Todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> findAll() {
        return repository.findAll();
    }

    public void deleteTodo(String id) {
        repository.deleteById(id);
        ;
    }

    public void updateTodo(String id, Todo todo) {
        Optional<Todo> updateTodo = repository.findById(id);
        if (updateTodo.isPresent()) {
            Todo todoDoc = updateTodo.get();
            todoDoc.setTitle(todo.getTitle());
            todoDoc.setTitle(todo.getTitle());
            todoDoc.setCompleted(todo.getCompleted());
            repository.save(todoDoc);
        } else {
            System.out.println("nothing");
        }
    }

    public void addTodo(Todo todo) {
        if (todo.getTitle() != null) {
            repository.save(todo);
        }else{
            System.out.println("nothing");
        }
    }

}
