package org.josamtechie.corejava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 5 tasks for execution
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // simulate some work with 2 seconds delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Task " + taskId + " was interrupted");
                }
                System.out.println("Task " + taskId + " completed");
            });
        }

        // Shutdown the executor service gracefully
        executor.shutdown();
    }
}
