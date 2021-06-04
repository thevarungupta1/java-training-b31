package com.thevarungupta.Day1;
//
//class Parent{
//    public Parent(){
//        System.out.println("Parent constructor...");
//    }
//}
//
//class Child extends Parent{
//    public Child(){
//        System.out.println("Child constructor..");
//    }
//}
//
//
//public class Demo7 {
//    public static void main(String[] args) {
//        Child c = new Child();
//
//    }
//}


class Parent{
    public Parent(){

    }

    public Parent(int x){
        System.out.println("Parent constructor..."+ x);
    }
}

class Child extends Parent{
    public Child(int x){
        //super(x);
        System.out.println("Child constructor..");
    }
}


public class Demo7 {
    public static void main(String[] args) {
        Child c = new Child(10);

    }
}
