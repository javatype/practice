package com.bhagya.springboot.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


public class User {

    private String name;
    private int age;
    private String country;

    public User(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public User(Class<ConfigEnv> configEnvClass) {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
