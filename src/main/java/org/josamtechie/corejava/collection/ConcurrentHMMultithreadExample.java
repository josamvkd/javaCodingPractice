package org.josamtechie.corejava.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHMMultithreadExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Runnable writer1 = () -> {
            for (int i = 0; i < 5; i++) {
                map.put("Thread-1-" + i, i);
            }
        };

        Runnable writer2 = () -> {
            for (int i = 5; i < 10; i++) {
                map.put("Thread-2-" + i, i);
            }
        };

        Thread t1 = new Thread(writer1);
        Thread t2 = new Thread(writer2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

