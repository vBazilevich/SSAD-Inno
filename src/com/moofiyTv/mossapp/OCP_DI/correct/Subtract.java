package com.moofiyTv.mossapp.OCP_DI.correct;

public class Subtract implements Operation {

    double left, right;

    public Subtract(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double operate() {
        return left - right;
    }
}
