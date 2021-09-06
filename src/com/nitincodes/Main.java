package com.nitincodes;
// java program to put formal variables in a method:

class Employee{
    private int salary;
    private int wh;                              // wh = working hour of an employee:
    // putting formal variable in a method
    public void setvalues(int tsal,int twh)
    {
        salary = tsal;
        wh = twh;
    }
    public void printvalues(){
        System.out.println(salary+" "+wh);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        obj1.setvalues(20000,6);
        obj2.setvalues(15000,7);
        obj1.printvalues();
        obj2.printvalues();





    }
}
