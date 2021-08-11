package com.bhagya.springboot.xml;

public class IndexApp1 {

    private IService service;
    private String hello;

    public IndexApp1(IService service, String hello) {
        this.service = service;
        this.hello = hello;
    }
}
