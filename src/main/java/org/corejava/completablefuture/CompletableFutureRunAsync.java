//package org.josamtechie.corejava.completablefuture;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.josamtechie.corejava.completablefuture.dto.Employee;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;
//
//// Runs a Runnable asynchronously and returns CompletableFuture<Void>
//public class CompletableFutureRunAsync
//{
//    // ForkJoinPool.commonPool
//    public Void saveEmployees(File jsonFile) throws ExecutionException, InterruptedException
//    {
//        ObjectMapper mapper = new ObjectMapper();
//        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync( () ->
//            {
//                try {
//              List<Employee> employees = mapper.readValue(jsonFile, new TypeReference<List<Employee>>(){});
//                    System.out.println("Thread :"+Thread.currentThread().getName());
//              //employees.stream().forEach(System.out::println);
//                    System.out.println(employees.size());
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//        });
//     return runAsyncFuture.get();
//    }
//
//    // Custom Thread pool
//    public Void saveEmployeesNew(File jsonFile) throws ExecutionException, InterruptedException
//    {
//        ObjectMapper mapper = new ObjectMapper();
//        Executor executors = Executors.newFixedThreadPool(5);
//        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync((Runnable) () ->
//        {
//            try {
//                List<Employee> employees = mapper.readValue(jsonFile, new TypeReference<List<Employee>>(){});
//                System.out.println("Thread :"+Thread.currentThread().getName());
//                //employees.stream().forEach(System.out::println);
//                System.out.println(employees.size());
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }, executors);
//        return runAsyncFuture.get();
//    }
//
//    public static void main(String[] args) throws ExecutionException, InterruptedException
//    {
//        CompletableFutureRunAsync runAsync = new CompletableFutureRunAsync();
//        runAsync.saveEmployees(new File("employee.json"));
//        runAsync.saveEmployeesNew(new File("employee.json"));
//    }
//}
