package com.bhagya.springboot.designpattern.singlatondesignpattern.absatrctfactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
