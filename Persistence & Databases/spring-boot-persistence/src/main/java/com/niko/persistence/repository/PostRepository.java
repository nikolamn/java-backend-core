package com.niko.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niko.persistence.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}