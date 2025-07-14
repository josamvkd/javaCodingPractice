package org.josamtechie.corejava.runandcall;

import java.util.concurrent.*;

public class CallableExample
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        Callable<String> task = () -> {
            Thread.sleep(1000);//Simulate long task
            return "Callable task completed";
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(task);

        String result = future.get();
        System.out.println(result);

        executor.shutdown();
    }
}
