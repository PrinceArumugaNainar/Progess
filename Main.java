package Revision;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
	
	
	AtomicInteger count = new AtomicInteger(0);

	void increment() {
        count.incrementAndGet();
    }
}

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}



/*

Interview takeaway: AtomicInteger handles atomic updates; 

join() handles thread completion ordering. They solve two different problems.

*/