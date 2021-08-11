package com.bhagya.springboot.threads;

import org.junit.jupiter.api.Test;

import static com.bhagya.springboot.threads.Confinement.computeFact;
import static org.junit.jupiter.api.Assertions.*;

class ConfinementTest {
    @Test
    public void testCompute(){
       new Thread(new Runnable() { // create a thread using an
            public void run() {     // anonymous Runnable
                computeFact(99);
            }
        }).start();
    computeFact(100);
}

}