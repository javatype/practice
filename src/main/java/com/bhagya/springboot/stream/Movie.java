package com.bhagya.springboot.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Movie {
    private String title;
@Value("${name}")
  private String name;

    private int likes;
    @Autowired
    public Movie(@Value("${some.title:somedefault}") String title, @Value("${some.likes:1}") int likes) {
        this.title = title;
        this.likes = likes;
        System.out.println("---flds;pf,l;s,f;oiajsdiou"+System.getProperty("somePro"));
    }

    public int getLikes() {
        return likes;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
