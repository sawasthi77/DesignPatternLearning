package com.excercise;

public class Football extends Game{

    @Override
    protected void initializeGame() {
        System.out.println("We are in Football ground");
    }

    @Override
    protected void playing() {
        System.out.println(" I am interested in playing football");
    }

    @Override
    protected void showResult() {
        System.out.println("Football is the game we are playing");
    }
}
