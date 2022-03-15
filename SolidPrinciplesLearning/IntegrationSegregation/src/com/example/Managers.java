package com.example;

public class Managers implements IManagers{
    @Override
    public void addBonus() {
        System.out.println("Managers gives Bonus");
    }

    @Override
    public void salary() {
        System.out.println("Managers gives salary");
    }

    @Override
    public void hire() {
        System.out.println("Managers hires");
    }

    @Override
    public void train() {
        System.out.println("Managers trains");
    }
}
