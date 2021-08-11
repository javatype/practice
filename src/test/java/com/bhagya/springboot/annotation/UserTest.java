package com.bhagya.springboot.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class UserTest {

    @Test
    public void Test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigEnv.class);

        //
         User user = context.getBean(User.class);
        //User user=new User(ConfigEnv.class);

        System.out.println("name --> "+user.getName());
        System.out.println("age --> "+user.getAge());
        System.out.println("country --> "+user.getCountry());


    }
}