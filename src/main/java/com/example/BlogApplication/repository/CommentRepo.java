package com.example.BlogApplication.repository;

import com.example.BlogApplication.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepo  extends JpaRepository<Comment, Integer> {

}
