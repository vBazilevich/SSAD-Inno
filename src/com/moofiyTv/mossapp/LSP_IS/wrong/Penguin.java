package com.moofiyTv.mossapp.LSP_IS.wrong;


public class Penguin implements Birds {
    @Override
    public void fly() {
        throw new AssertionError("I Can't fly");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void layEggs() {
        System.out.println("laying eggs");
    }

    @Override
    public void swim() {
        System.out.println("swim");

    }
}
