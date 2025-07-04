package com.josamtechie.lambda.example;

import java.util.Objects;

public class Book {

    private int id;
    private String name;
    private int pages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(int id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    public Book() {
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return getId() == book.getId() && getPages() == book.getPages() && Objects.equals(getName(), book.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPages());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
