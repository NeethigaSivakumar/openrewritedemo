package com.neethu;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
    
    // OpenRewrite can clean up unnecessary @Autowired on single constructors
    @Autowired
    public UserService() {
    }

    public String getGreeting(String name) {
        return "Hello, " + name + "! Welcome to the legacy Java 8 app.";
    }
}