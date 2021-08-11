package com.bhagya.springboot.threads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleJoinTest {

    @Test
    public void givenStartedThread_whenJoinCalled_waitsTillCompletion()
            throws InterruptedException {
        Thread t2 = new SampleJoin(4);
                t2.start();
        System.out.println("Invoking join");
        t2.join();
        System.out.println("Returned from join");
        assertFalse(t2.isAlive());
    }

}