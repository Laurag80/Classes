package com.syntax.class19;

public class Book {

    String title;
    String author;
    int pages;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Executing 1st Constructor");
    }

     Book(String title, String author, int pages) {
        this(title, author);
        this.pages = pages;
        System.out.println("Executing 2nd Constructor");
    }

    void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Pages: " + this.pages);
    }
}
