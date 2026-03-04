package com.niko.persistence.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niko.persistence.model.User;
import com.niko.persistence.service.DemoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/demo")
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    // Lazy loading (triggers N+1)
    @GetMapping("/users-lazy")
    public List<User> usersLazy() {
        return demoService.getAllUsersLazy();
    }

    // Eager loading (solves N+1)
    @GetMapping("/users-eager")
    public List<User> usersEager() {
        return demoService.getAllUsersEager();
    }

    // Change username (dirty checking)
    @PutMapping("/user/{id}/username")
    public String changeUsername(@PathVariable Long id, @RequestParam String username) {
        demoService.changeUsername(id, username);
        return "Username updated for user " + id;
    }

    // Test transaction rollback
    @PostMapping("/user-fail")
    public String createUserFail(@RequestParam String username) {
        try {
            demoService.createUserAndFail(new User(null, username, null));
        } catch (RuntimeException e) {
            return "Transaction rolled back: " + e.getMessage();
        }
        return "Should never happen";
    }
}