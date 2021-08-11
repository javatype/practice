package com.bhagya.springboot.xml;

import org.springframework.beans.factory.annotation.Autowired;

public class IndexApp {

    private IService service;


    public IService getService() {
        return service;
    }

    public void setService(IService service) {
        this.service = service;
    }
}
