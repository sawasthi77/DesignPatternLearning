package com.practice;

public abstract class Vehicle {
    protected  int age;
    protected String type;
    public Vehicle(String type, int age){
        this.type = type;
        this.age = age;
    }
    protected void speedUp(){
        System.out.println("Vehicle is speeding up");
    }
    protected void slowDown(){
        System.out.println("Vehicle is slowing down");
    }
    protected abstract void vehicleFuel();
}
