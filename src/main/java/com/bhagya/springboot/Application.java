package com.bhagya.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
       // System.out.println("add some");
        System.setProperty("somePro", "initial");
        SpringApplication.run(Application.class, args);
    }

}
