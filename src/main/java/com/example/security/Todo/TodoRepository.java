package com.example.security.Todo;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface TodoRepository extends MongoRepository<Todo, String> {

}
