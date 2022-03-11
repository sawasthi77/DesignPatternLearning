package com.abstractDP.example;

public class App {
    public static void main(String args[]){
        AbstractFactory factory = FactoryProducer.getFactory("electric");
        factory.getCar("ford").assemble();
    }
}
