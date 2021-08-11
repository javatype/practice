package com.bhagya.springboot;

import com.bhagya.springboot.controller.SpringBootStudentServiceApplication;
import com.bhagya.springboot.hibernate.ArticleRepository;
import com.bhagya.springboot.zul.ErrorFilter;
import com.bhagya.springboot.zul.PostFilter;
import com.bhagya.springboot.zul.PreFilter;
import com.bhagya.springboot.zul.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
