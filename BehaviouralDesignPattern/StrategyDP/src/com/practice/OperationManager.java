package com.practice;
// abstract layer between the high level and low level modules.
public class OperationManager {
    // we have to use composition
    //because the behaviour can be changed at run time
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(int num1, int num2){
        this.strategy.execute(num1, num2);
    }
}
