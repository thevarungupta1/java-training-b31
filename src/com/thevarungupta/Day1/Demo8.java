package com.thevarungupta.Day1;

public class Demo8 {
    public static void main(String[] args) {
        String message = "Hello world";

        message.indexOf('o');  // 4
        message.indexOf('o', 5);  //7
        message.indexOf("ll"); // 2

        System.out.println(message.indexOf('o'));
        System.out.println(message.indexOf('o',5));
        System.out.println(message.indexOf("ll"));

    }
}
