package com.thevarungupta.Day1;

class Employee{
    public int empId;
    public String firstName;
    public String lastName;
    public String email;

    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
}

class FullTimeEmployee extends Employee{
    public int annualSalary;
}

class PartTimeEmployee extends Employee{
    public int hourSalary;
}

public class Demo6 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstName = "Mark";
        fte.lastName = "Smith";
        fte.getFullName();

        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName = "Paul";
        pte.lastName = "Watson";
        pte.getFullName();
    }
}
