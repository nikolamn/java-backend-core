package com.niko.persistence.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niko.persistence.model.User;
import com.niko.persistence.repository.UserRepository;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void createUserAndFail(User user) {
        userRepository.save(user);
        throw new RuntimeException("Rollback test"); // transaction rolls back
    }
    
    @PostConstruct
    public void testLazyLoading() {
        List<User> users = userRepository.findAll(); // N+1 if lazy on posts
        users.forEach(u -> System.out.println(u.getPosts().size())); // triggers extra queries
    }
    
    @Transactional
    public void updateUser(Long id, String newUsername) {
        User user = userRepository.findById(id).orElseThrow();
        user.setUsername(newUsername); // dirty checking - automatically updated on commit
    }
}