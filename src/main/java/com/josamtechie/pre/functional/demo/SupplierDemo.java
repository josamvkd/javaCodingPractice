package com.josamtechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;

/*public class SupplierDemo implements Supplier<String> {

    @Override
    public String get() {
        return "Hi Jomon Samuel Thomas";
    }

    public static void main(String[] args) {
        Supplier supplier = new SupplierDemo();
        System.out.println(supplier.get());
    }
}*/

public class SupplierDemo{
    public static void main(String[] args) {
       /* Supplier<String> supplier = () -> "Hi Jomon Samuel Thomas";
        System.out.println(supplier.get());*/

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Hi Jomon Samuel Thomas"));
    }
}
