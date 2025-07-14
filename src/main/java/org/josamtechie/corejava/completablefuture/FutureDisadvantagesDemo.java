package org.josamtechie.corejava.completablefuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.lang.Thread.sleep;

public class FutureDisadvantagesDemo
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future1 = service.submit(() -> {
            // asume we are calling an API
            System.out.println("Thread: "+Thread.currentThread().getName());
            sleep(2000);
            return Arrays.asList(1, 2, 3, 4, 5);
        });
        // Point 1 : It Cannot be manually completed the future object
        // During api call thread wait 2000millisecond to complete the task there is no method available to complete the future object
        List<Integer> list = future1.get();
        System.out.println(list);
        // Point 2 : Multiple futures cannot be chained together
        // there us no method available to process with the result 'list'

        // Point 3 : We cannot combine multiple future together
        Future<List<Integer>> future2 = service.submit(() -> {
            System.out.println("Thread: "+Thread.currentThread().getName());
            return Arrays.asList(1, 2, 3, 4, 5);
        });
        Future<List<Integer>> future3 = service.submit(() -> {
            System.out.println("Thread: "+Thread.currentThread().getName());
            return Arrays.asList(1, 2, 3, 4, 5);
        });
        future1.get();
        future2.get();
        future3.get();

        // We can call each future separately, we cannot combine this together
        //future1.get() + future2.get() + future3.get()
        // Point 4 : No Proper Exception Handling mechanism

        Future<List<Integer>> future4 = service.submit(() -> {
            System.out.println("Thread: "+Thread.currentThread().getName());
            System.out.println(10/0);
            return Arrays.asList(1, 2, 3, 4, 5);
        });
        List<Integer> list1 = future4.get();
        System.out.println(list1);

    }
}
