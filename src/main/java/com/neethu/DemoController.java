package com.neethu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Correct J2EE import that OpenRewrite will transform to jakarta.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

@RestController
public class DemoController {

    @GetMapping("/test")
    public String testMigration(HttpServletRequest request, @RequestParam @NotNull String param) {
        return "Migrated successfully! IP: " + request.getRemoteAddr();
    }
}
