package com.bhagya.springboot.hibernate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    List<Article> findByTitle(String title);
    List<Article> findDistinctByCategory(String category);
    List<Article> findByTitleAndCategory(String title, String category);

    @Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
    List<Article> fetchArticles(@Param("title") String title, @Param("category") String category);
}