package com.example.jpa.repository;

import com.example.jpa.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
   Page<Comment> findByPostId(Long postId, Pageable pageable);
   Optional<Comment> findByIdAndPostId(Long id, Long postId);
}
