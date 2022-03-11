package com.practice;

public class ElectricCar extends Vehicle{
    public ElectricCar(String type, int age) {
        super(type, age);
    }
    @Override
    protected void speedUp(){
        System.out.println("Electric Car is speeding up");
    }
    @Override
    protected void slowDown(){
        System.out.println("Electric Car is slowing down");
    }
    @Override
    protected void vehicleFuel(){
        throw new Error("Electric Car can not have fuel");
    }
}
