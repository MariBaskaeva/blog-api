package com.elbundo.blogapi.model;

import com.elbundo.blogapi.model.Article;
import com.elbundo.blogapi.model.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private User author;

    private Date createdAt = new Date();

    private String content;

    @ManyToOne
    private Article article;
}
