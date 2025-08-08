package com.sampleprograms.java;
public class Encapsulation {
    private double salary;

    public void setSalary(double sal) {
        if (sal > 0) {
            salary = sal;
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    public double getSalary() {
        return salary;
    }
}