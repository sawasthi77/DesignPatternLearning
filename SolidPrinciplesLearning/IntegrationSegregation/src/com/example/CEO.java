package com.example;

public class CEO implements ICeo{
    @Override
    public void addBonus() {
        System.out.println("CEO gives Bonus");
    }

    @Override
    public void salary() {
        System.out.println("CEO Salary");
    }

    @Override
    public void makeDecisions() {
        System.out.println("CEO makes decision");
    }

    @Override
    public void addStocks() {
        System.out.println("CEO adds stocks");
    }
}
