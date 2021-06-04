package com.thevarungupta.Day1;

class Book{
    private String title;
    private String author;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(){
        System.out.println("Book: Title: "+ title+", Author: "+ author+", Price: "+ price);
    }
}

public class Demo1 {

    public static void main(String[] args) {
	    Book book1 = new Book();
	    book1.setTitle("Title 1");
	    book1.setAuthor("Author 1");
	    book1.setPrice(100);

        Book book2 = new Book();
        book2.setTitle("Title 2");
        book2.setAuthor("Author 2");
        book2.setPrice(200);

        book1.print();
        book2.print();
    }
}
