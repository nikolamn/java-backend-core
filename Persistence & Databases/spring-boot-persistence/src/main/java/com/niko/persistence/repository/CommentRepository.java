package com.niko.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.niko.persistence.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	
	@Query("SELECT c FROM Comment c JOIN c.post p WHERE p.author.id = :userId")
	List<Comment> findCommentsByUserId(@Param("userId") Long userId);
}