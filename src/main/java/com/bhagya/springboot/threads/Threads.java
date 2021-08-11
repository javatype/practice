package com.bhagya.springboot.threads;

public class Threads implements Runnable{
    @Override
    public void run() {
        System.out.println("my threads"+Thread.currentThread().getName());
    }
}
