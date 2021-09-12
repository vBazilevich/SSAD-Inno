package com.moofiyTv.mossapp.OCP_DI.correct;

//❌❌❌❌
// how many SOLID Principle does it violate ?
// Fix it !!

// l - r
// r + l
// DI : high = Abstract class
// low : classes
//
public class Calculator {
    private double left;
    private double right;


    public double calculate(Operation operation) {
        return operation.operate();
    }

    void main() {
        Calculator calculator = new Calculator();
        Addition add = new Addition(2,8);
        Subtract subtract = new Subtract(2,8);
        calculator.calculate(add);
        calculator.calculate(subtract);
    }

}


