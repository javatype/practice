package com.bhagya.springboot.service;

import com.bhagya.springboot.model.Foo;
import com.bhagya.springboot.model.IFooService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FooServiceImpl implements IFooService {
    @Override
    public Foo retrieveByName(String name) {
        return null;
    }

    @Override
    public Foo findOne(long id) {
        return null;
    }

    @Override
    public List<Foo> findAll() {
        return null;
    }

    @Override
    public Foo create(Foo entity) {
        return null;
    }

    @Override
    public Foo update(Foo entity) {
        return null;
    }

    @Override
    public void delete(Foo entity) {

    }

    @Override
    public void deleteById(long entityId) {

    }
}
