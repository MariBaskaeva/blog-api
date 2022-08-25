package com.elbundo.blogapi.service;

import com.elbundo.blogapi.model.Article;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    Optional<Article> getById(Long Id);
    Iterable<Article> getAll();
    Article save(Article article);
}
