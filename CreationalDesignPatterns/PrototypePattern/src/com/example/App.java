package com.example;

public class App {

    public static void main(String args[]){
        Shape square = new Square(10, 10);
        square.draw();

        Shape squareClone  = square.cloneObject();
        squareClone.draw();
    }

}
