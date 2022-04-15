package com.example;

public class Rectangle extends Shape{
    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }

    @Override
    public Shape cloneObject() {
        return new Rectangle(width, height);
    }
}
