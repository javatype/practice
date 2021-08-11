package com.bhagya.springboot.rest;

public class RestPreconditions {
    public static <T> T checkFound(T resource) {
        if (resource == null) {
            throw new RuntimeException();
        }
        return resource;
    }
}
