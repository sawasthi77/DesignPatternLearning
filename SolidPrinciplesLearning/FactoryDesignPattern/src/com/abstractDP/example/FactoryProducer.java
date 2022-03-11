package com.abstractDP.example;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("electric")){
            return new ElectricCarFactory();
        }
        else if( factory.equalsIgnoreCase("petrol")){
            return new PetrolFactory();
        }
        return null;
    }
}
