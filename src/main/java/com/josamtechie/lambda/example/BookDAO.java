package com.josamtechie.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(206, "Webservices", 400));
        books.add(new Book(303, "Algorithm", 400));
        books.add(new Book(405, "Microservice", 400));
        return books;
    }
}
