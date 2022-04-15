package com.practice;

public class App {

    public static void main(String args[]){
        OperationManager operationManager = new OperationManager();
        operationManager.setStrategy(new Division());
        operationManager.execute(2, 4);
    }
}
