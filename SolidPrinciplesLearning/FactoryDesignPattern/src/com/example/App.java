package com.example;

public class App {
    public static void main(String args[]){
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();
    }
}
