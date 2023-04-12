package com.example.security.Todo;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Document
@Data
public class Todo {
    @Id
    private String Id;
    @NonNull
    private String title;
    @NonNull
    private String completed;
    @NonNull
    private LocalDate date;

}
