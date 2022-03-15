package com.example;

public class App {
    public static void main(String args[]){
        ICeo iCeo = new CEO();
        iCeo.addStocks();
        iCeo.makeDecisions();
        iCeo.addBonus();
        iCeo.salary();
    }
}
