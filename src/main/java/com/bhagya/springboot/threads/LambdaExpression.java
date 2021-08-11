package com.bhagya.springboot.threads;

public class LambdaExpression {


public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread( new CounterThread());
    t.start();
    while(CounterThread.counter<5000){
        System.out.println("not reached");
        //Thread.sleep(1000);
    }
    System.out.println("reached");
}



}
class CounterThread implements Runnable{
     static int counter=0;
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++)
            counter++;
    }
}

