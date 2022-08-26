package com.elbundo.blogapi.service;

import com.elbundo.blogapi.model.Article;
import com.elbundo.blogapi.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getById(Long Id);
    Iterable<User> getAll();
    User save(User article);
}
