package com.example;

public class Square extends Shape{
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }

    @Override
    public Shape cloneObject() {
        return new Square(width, height);
    }
}
