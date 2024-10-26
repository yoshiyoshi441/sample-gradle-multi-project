package com.github.yoshiyoshi441.controller;

import com.github.yoshiyoshi441.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public User get() {
        return new User("test-user", 30);
    }
}
