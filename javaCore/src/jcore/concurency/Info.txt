Basic Concurency

1. Threads
The core unit of concurrency in Java
Every Java program has at least one thread (main thread)
Can create threads by:
    Extending Thread
    Implementing Runnable
    Using ExecutorService (preferred)


2. ExecutorService
High-level API to manage thread pools
Avoids manually creating threads; handles scheduling and reuse

3. Synchronized methods / Blocks
Ensures mutual exclusion: only one thread can access a block or method at a time.
Prevents race conditions.

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

4. Volatile keyword
Ensures visibility of changes to a variable across threads
Does not guarantee atomicity

class Flag {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void run() {
        while (running) { /* do work */ }
    }
}
    
5. Atomic variables
From java.util.concurrent.atomic.
Provides atomic operations without synchronized.

AtomicInteger counter = new AtomicInteger(0);
counter.incrementAndGet(); // atomic increment