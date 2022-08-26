package com.elbundo.blogapi.repository;

import com.elbundo.blogapi.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
