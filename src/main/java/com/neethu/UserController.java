package com.neethu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
public class UserController {

    @GetMapping("/test")
    public String testMigration(HttpServletRequest request) {
        return "Migrated IP: " + request.getRemoteAddr();
    }

    @PostMapping("/users")
    public String createUser(@Valid @RequestBody UserEntity user) {
        return "Created user: " + user.getName();
    }
}