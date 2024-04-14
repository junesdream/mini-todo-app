package com.example.minitodoapp.controller;


import com.example.minitodoapp.model.TodoItem;
import com.example.minitodoapp.repo.TodoRepo;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@RequestBody @NotNull @Validated TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }
}
