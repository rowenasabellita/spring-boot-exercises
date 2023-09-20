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

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public boolean getIsCompleted() {
        return this.isCompleted;
    }

    public void setTodoId(String id) {
        this.id = id;
    }

    public String getTodoId() {
        return this.id;
    }
}
