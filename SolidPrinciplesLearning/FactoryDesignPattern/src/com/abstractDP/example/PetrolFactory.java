package com.abstractDP.example;

public class PetrolFactory implements AbstractFactory{
    @Override
    public Car getCar(String type) {
        if(type.equalsIgnoreCase("Ford")){
            return new PetrolFord();
        }
        else if(type.equalsIgnoreCase("Toyota")){
            return new PetrolToyota();
        }
        return null;
    }
}
