package com.bhagya.springboot.annotation;

import com.bhagya.springboot.stream.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.web.context.annotation.RequestScope;

import static org.apache.naming.ResourceRef.SCOPE;

@Configuration
@ComponentScan("com.blog.spring.domain")
@PropertySource("classpath:user.properties")
@ConfigurationProperties(prefix = "us")
public class ConfigEnv {

    @Autowired
    Environment env;
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Bean
    //@RequestScope
    public User getUser() {
       // String name = env.getProperty("name");
        //we can specify the property type
        int age = env.getProperty("us.age", Integer.class);
        String country = env.getProperty("us.country");
        return new User(name, age, country);
    }
    @Bean
    public User getUser1() {
        // String name = env.getProperty("name");
        //we can specify the property type
        int age = env.getProperty("us.age", Integer.class);
        String country = env.getProperty("us.country");
        return new User(name, age, country);
    }
    @Bean
    public User getUser2(User getUser) {
        // String name = env.getProperty("name");
        //we can specify the property type
        int age = env.getProperty("us.age", Integer.class);
        String country = env.getProperty("us.country");
        return new User(name, age, country);
    }
}