package com.elbundo.blogapi.service;

import com.elbundo.blogapi.model.Comment;

import java.util.Optional;

public interface CommentService {
    Optional<Comment> getById(Long id);
    Iterable<Comment> getAll();
    Comment save(Comment article);
}
