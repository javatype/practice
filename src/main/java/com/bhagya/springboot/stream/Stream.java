package com.bhagya.springboot.stream;

import java.util.List;

public class Stream {
    public void show() {
        List<Movie> movies = List.of(new Movie("a", 10),
                new Movie("b", 20), new Movie("c", 30));

        movies.stream()
               .map(Movie::getLikes)
               .forEach(System.out::println);
    }
}

