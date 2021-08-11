package com.bhagya.springboot.model;

public interface IFooService extends IOperation<Foo> {

    Foo retrieveByName(String name);

  //  Page<Foo> findPaginated(Pageable pageable);

}
