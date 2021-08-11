package com.bhagya.springboot.threads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreadsTest {
    @Test
public void threadsTest(){
        System.out.println(Thread.currentThread().getName());
        Thread thread =new Thread(new Threads());
        thread.start();

    }

}