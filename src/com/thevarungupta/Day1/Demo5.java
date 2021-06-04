package com.thevarungupta.Day1;

import java.sql.SQLOutput;

class Calculator{

    public void addNumber(int num1, int num2){
        System.out.println("Sum: "+ (num1 + num2));
    }

    public static void subNumber(int num1, int num2){
        System.out.println("Sub: "+ (num1 - num2));
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.addNumber(20,10);
        Calculator.subNumber(20,10);
    }
}
