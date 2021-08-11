package com.bhagya.springboot.xml;

public class IndexService implements IService{
    @Override
    public String serve() {
        return "Hello World";
    }
}
