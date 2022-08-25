package com.elbundo.blogapi.controller;

import com.elbundo.blogapi.model.Article;
import com.elbundo.blogapi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api", produces = "application/json")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles")
    public Iterable<Article> getAllArticles() {
        return articleService.getAll();
    }

    @GetMapping("/article/{id}")
    public ResponseEntity<Article> articleById(@PathVariable("id") Long Id) {
        Optional<Article> article = articleService.getById(Id);
        if(article.isPresent()) {
            return new ResponseEntity<>(article.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/articles")
    @ResponseStatus(HttpStatus.CREATED)
    public Article postArticle(@RequestBody Article article) {
        return articleService.save(article);
    }
}
