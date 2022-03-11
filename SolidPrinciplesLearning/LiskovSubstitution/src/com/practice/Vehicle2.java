package com.practice;
// This is another approach of creating the abstract method in the parent class
// If we want to avoid usage of abstract method
public abstract class Vehicle2 implements IVehicle{
    protected  int age;
    protected String type;
    public Vehicle2(String type, int age){
        this.type = type;
        this.age = age;
    }
    protected void speedUp(){
        System.out.println("Vehicle is speeding up");
    }
    protected void slowDown(){
        System.out.println("Vehicle is slowing down");
    }
}
