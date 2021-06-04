package com.thevarungupta.Day1;

class Bank{
    public int getRateOfInterest(){
        return 2;
    }
}

class BankA extends Bank{
    public int getRateOfInterest(){
        super.getRateOfInterest();
        return 5;
    }
}

class BankB extends Bank{
    public int getRateOfInterest(){
        return 6;
    }
}



public class Demo11 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();

        System.out.println(bankA.getRateOfInterest());
        System.out.println(bankB.getRateOfInterest());
    }
}
