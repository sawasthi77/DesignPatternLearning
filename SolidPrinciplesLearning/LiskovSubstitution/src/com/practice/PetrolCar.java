package com.practice;

public class PetrolCar extends Vehicle{
    public PetrolCar(String type, int age) {
        super(type, age);
    }
    @Override
    protected void speedUp(){
        System.out.println("Petrol Car is speeding up");
    }
    @Override
    protected void slowDown(){
        System.out.println("Petrol Car is slowing down");
    }
    @Override
    protected void vehicleFuel(){
        System.out.println("Petrol Car fuel");
    }
}
