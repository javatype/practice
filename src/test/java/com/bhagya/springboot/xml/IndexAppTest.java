package com.bhagya.springboot.xml;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class IndexAppTest {
    @Test
    public void whenGetBeans_returnsBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        IndexApp1 indexApp = applicationContext.getBean("indexApp1", IndexApp1.class);
        assertNotNull(indexApp);
    }
}