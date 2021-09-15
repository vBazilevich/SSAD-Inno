package com.moofiyTv.mossapp.homework;

public abstract class Worker {
    private double salary;

    public Worker(double salary) {
        this.salary = salary;
    }

    void calculateTax(int percentage) {
        // Taking weird implementation from original example
        salary = salary * percentage;
    }
}
