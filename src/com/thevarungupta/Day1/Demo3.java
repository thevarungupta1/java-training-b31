package com.thevarungupta.Day1;

class Test{

    private int x = 0;

    public Test(){
        System.out.println("1st Constructor");
    }

    public Test(int x){
        //this();
        this.x = x;
        System.out.println("2nd Constructor");
    }

    public void print(){
        System.out.println("printing....");
    }

}

public class Demo3 {
    public static void main(String[] args) {
        Test test = new Test(10);
        test.print();
    }
}
