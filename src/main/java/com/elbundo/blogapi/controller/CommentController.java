package com.elbundo.blogapi.controller;

import com.elbundo.blogapi.model.Comment;
import com.elbundo.blogapi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api", produces = "application/json")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public Iterable<Comment> getAllComments() {
        return commentService.getAll();
    }

    @GetMapping("/comment/{id}")
    public ResponseEntity<Comment> commentById(@PathVariable("id") Long Id) {
        Optional<Comment> comment = commentService.getById(Id);
        if(comment.isPresent()) {
            return new ResponseEntity<>(comment.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public Comment postComment(@RequestBody Comment comment) {
        return commentService.save(comment);
    }
}