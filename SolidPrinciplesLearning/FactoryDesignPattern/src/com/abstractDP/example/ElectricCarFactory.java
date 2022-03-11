package com.abstractDP.example;

public class ElectricCarFactory implements AbstractFactory{
    @Override
    public Car getCar(String type) {
        if(type.equalsIgnoreCase("Ford")){
            return new ElectricFord();
        }else if( type.equalsIgnoreCase("Toyota")){
            return new ElectricToyota();
        }
        return null;
    }
}
