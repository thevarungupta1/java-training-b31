package com.thevarungupta.Day1;

import java.awt.print.Book;

class Book2{
    private String title;
    private String author;
    private int price;

    public Book2(String title, String author, int price){
        this.title = title;
        this.author=author;
        this.price = price;
    }

    public void print(){
        System.out.println("Book: Title: "+ title+", Author: "+ author+", Price: "+ price);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Book2 book1 = new Book2("HTML", "Author 1", 100);
        Book2 book2 = new Book2("Java", "Author 2", 200);

        book1.print();
        book2.print();
    }
}
