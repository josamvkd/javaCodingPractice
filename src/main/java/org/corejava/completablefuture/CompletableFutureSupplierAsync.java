//package org.josamtechie.corejava.completablefuture;
//
//import org.josamtechie.corejava.completablefuture.database.EmployeeDataBase;
//import org.josamtechie.corejava.completablefuture.dto.Employee;
//
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;
//
//// Runs a Supplier<T> asynchronously and returns CompletableFuture<T>
//public class CompletableFutureSupplierAsync
//{
//    // ForkJoinPool.commonPool
//    public List<Employee> getEmployees() throws ExecutionException, InterruptedException
//    {
//        CompletableFuture<List<Employee>> listCompletableFuture = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Executed by : " + Thread.currentThread().getName());
//            return EmployeeDataBase.fetchEmployees();
//        });
//        return listCompletableFuture.get();
//    }
//
//    // Custom thread pool-1-thread
//    public List<Employee> getEmployeesNew() throws ExecutionException, InterruptedException
//    {
//        Executor executor = Executors.newCachedThreadPool();
//        CompletableFuture<List<Employee>> listCompletableFuture = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Executed by : " + Thread.currentThread().getName());
//            return EmployeeDataBase.fetchEmployees();
//        }, executor);
//        return listCompletableFuture.get();
//    }
//
//    public static void main(String[] args) throws ExecutionException, InterruptedException
//    {
//
//        CompletableFutureSupplierAsync supplierAsync = new CompletableFutureSupplierAsync();
//        List<Employee> employees = supplierAsync.getEmployees();
//        List<Employee> employees1 = supplierAsync.getEmployeesNew();
//        System.out.println(employees.size());
//        System.out.println(employees1.size());
//    }
//}
