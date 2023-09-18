package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;

@Document("rowena-todo")
@Getter
@Setter
public class Todo {
    @Id
    private String id;
    private String title;
    private boolean isCompleted;

    protected Todo() {

    }

    public Todo(String id, String title, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }
}
