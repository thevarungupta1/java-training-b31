package com.thevarungupta.Day1;

class Parent2{
    public void display(String name){
        System.out.println("Hello "+ name);
    }
}

class Child2 extends Parent2{
    public void display(String name){
        System.out.println("Welcome "+ name);
    }
}

public class Demo10 {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.display("Mark");
    }
}
