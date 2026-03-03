package jcore.concurency;

import java.util.concurrent.*;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Concurency Basics App started!");
    
        System.out.println("Thread Example!");
        Thread t1 = new Thread(() -> System.out.println("Hello from thread!"));
        t1.start();
        t1.join(); // wait for completion
        System.out.println("--------------------------");
    
    
        System.out.println("ExecutorService Example");
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Task 1 running"));
        executor.submit(() -> System.out.println("Task 2 running"));
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("--------------------------");
    

        System.out.println("Synchronized Example");
        Counter counter = new Counter();
        Thread t2 = new Thread(counter::increment);
        Thread t3 = new Thread(counter::increment);
        t2.start();
        t3.start();
        t2.join();
        t3.join();
        System.out.println("Counter value: " + counter.getCount());
        System.out.println("--------------------------");

        System.out.println("Volatile Example");
        Flag flag = new Flag();
        Thread t4 = new Thread(flag::run);
        t4.start();
        Thread.sleep(100); // simulate work
        flag.stop();
        t4.join();
        System.out.println("--------------------------");

        // System.out.println("Atomic Example");
        // AtomicInteger atomicCounter = new AtomicInteger(0);
        // atomicCounter.incrementAndGet();
        // System.out.println("Atomic counter: " + atomicCounter.get());
        // System.out.println("--------------------------");

        // System.out.println("Lock Example");
        // ReentrantLock lock = new ReentrantLock();
        // lock.lock();
        // try {
        //     System.out.println("Inside critical section with Lock");
        // } finally {
        //     lock.unlock();
        // }
        // System.out.println("--------------------------");
    }


    static class Counter {
        private int count = 0;
        public synchronized void increment() { count++; }
        public int getCount() { return count; }
    }

    static class Flag {
        private volatile boolean running = true;
            public void stop() { running = false; }
            public void run() {
                while (running) {
                System.out.println("Flag stopped running");
            }
        }
    }
}
