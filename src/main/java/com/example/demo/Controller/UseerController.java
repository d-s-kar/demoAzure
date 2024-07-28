package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UseerController {

    @GetMapping("/getName")
    public String getName() {
        return "Welcome to azure deployment";
    }
}
