package com.niko.persistence.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niko.persistence.model.User;
import com.niko.persistence.repository.UserRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final UserRepository userRepository;

    // Fetch all users with posts lazily ( N+1)
    public List<User> getAllUsersLazy() {
        return userRepository.findAll(); // posts are lazy
    }

    // Fetch all users with posts eagerly to fix N+1 
    public List<User> getAllUsersEager() {
        return userRepository.findAllWithPosts(); // defined with JOIN FETCH
    }

    // Dirty checking 
    @Transactional
    public void changeUsername(Long id, String newUsername) {
        User user = userRepository.findById(id).orElseThrow();
        user.setUsername(newUsername); // automatically persisted on commit
    }

    // Transaction rollback
    @Transactional
    public void createUserAndFail(User user) {
        userRepository.save(user);
        throw new RuntimeException("Rolling back this transaction");
    }
}