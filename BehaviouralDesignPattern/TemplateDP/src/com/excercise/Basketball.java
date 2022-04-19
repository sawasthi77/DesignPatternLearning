package com.excercise;

public class Basketball extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("We are in BasketBall court");
    }

    @Override
    protected void playing() {
        System.out.println(" I am interested in playing BasketBall ");
    }

    @Override
    protected void showResult() {
        System.out.println(" Football is the game we are playing ");
    }
}
