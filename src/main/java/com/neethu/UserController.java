package com.neethu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// These will be migrated to jakarta.*
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/greet")
    public String greet(HttpServletRequest request, @NotNull @RequestParam String name) {
        String clientIp = request.getRemoteAddr();
        return userService.getGreeting(name) + " (IP: " + clientIp + ")";
    }
}