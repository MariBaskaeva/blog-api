package com.elbundo.blogapi.service;

import com.elbundo.blogapi.model.Comment;
import com.elbundo.blogapi.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository repository;

    @Override
    public Optional<Comment> getById(Long Id) {
        return repository.findById(Id);
    }

    @Override
    public Iterable<Comment> getAll() {
        return repository.findAll();
    }

    @Override
    public Comment save(Comment comment) {
        return repository.save(comment);
    }
}
