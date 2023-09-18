package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import java.util.LinkedList;


@RestController
@RequestMapping("/todo")
public class TodoController {

    @GetMapping
    public String getTodo(){
        String someString = "Create Controller";
        return someString;
    }

    @PostMapping
    String createTodo(@RequestBody String title){
        return title;
    }

    @PutMapping
    String updateTodo(@RequestBody String title){
        return title;
    }
    
}