package com.bhagya.springboot.controller;

import com.bhagya.springboot.annotation.User;
import com.bhagya.springboot.aop.CustomerBo;
import com.bhagya.springboot.dao.EmployeeDAO;
import com.bhagya.springboot.hibernate.Article;
import com.bhagya.springboot.hibernate.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.rmi.ServerException;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private User getUser;
    @Autowired
    EmployeeDAO dao;
    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    CustomerBo customerBo;


    @GetMapping("/user/{name}")
    public List<User> getEmployees(@PathVariable String name) {
        System.out.println("count-" + dao.getAll());
        System.out.println("name" + name+getUser);
        return List.of(getUser);
    }

    @GetMapping("/articles/{id}")
    public Article getArtical(@PathVariable long id, @RequestParam("anyParam") String anyParam) {
        System.out.println("count"+ articleRepository.count() + anyParam);
        return articleRepository.findById(id).get();
    }

    @PostMapping("/article")
    public Article createArticle(@RequestBody Article article) {
        System.out.println("count"+ articleRepository.count());
        return articleRepository.save(article);
    }


    @GetMapping("/aop")
    public void testAOP() {
        customerBo.addCustomer();
    }
}
