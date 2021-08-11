package com.bhagya.springboot.controller;


import com.bhagya.springboot.zul.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class SpringBootStudentServiceApplication {

        @RequestMapping(value = "/echoStudentName/{name}")
        public String echoStudentName(@PathVariable(name = "name") String name)
        {
            return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
        }

        @RequestMapping(value = "/getStudentDetails/{name}")
        public Student getStudentDetails(@PathVariable(name = "name") String name)
        {
            return new Student(name, "Pune", "MCA");
        }

}

