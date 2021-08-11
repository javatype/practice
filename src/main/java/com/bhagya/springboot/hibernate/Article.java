package com.bhagya.springboot.hibernate;



import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="articles")
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="article_id")
    private long articleId;
    @Column(name="title")
    private String title;
    @Column(name="category")
    private String category;
    @JsonManagedReference
    @OneToMany(mappedBy = "articleID", cascade=CascadeType.ALL)
    private Set<Writer> writer;

    public long getArticleId() { return articleId; }
    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public Set<Writer> getWriter() {
        return writer;
    }

    public void setWriter(Set<Writer> writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", writer=" + writer +
                '}';
    }
}