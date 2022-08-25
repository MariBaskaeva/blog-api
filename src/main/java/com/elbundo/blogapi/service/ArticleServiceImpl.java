package com.elbundo.blogapi.service;

import com.elbundo.blogapi.model.Article;
import com.elbundo.blogapi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    private ArticleRepository repository;

    @Override
    public Optional<Article> getById(Long Id) {
        return repository.findById(Id);
    }

    @Override
    public Iterable<Article> getAll() {
        return repository.findAll();
    }

    @Override
    public Article save(Article article) {
        return repository.save(article);
    }
}
