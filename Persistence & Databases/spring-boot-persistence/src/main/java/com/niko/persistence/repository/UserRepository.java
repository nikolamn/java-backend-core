package com.niko.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.niko.persistence.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
    @Query("SELECT u FROM User u JOIN FETCH u.posts")
    List<User> findAllWithPosts();
}