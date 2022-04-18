package com.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject{
    // initial price of the stock is 100
    // also we need random values at some time so we need random walk
    private float price = 100;
    private Random random;
    private List<Observer> observerList;

    public StockExchange(){
        random = new Random();
        observerList = new ArrayList<>();
    }

    @Override
    public void addObservers(Observer o) {
        observerList.add(o);
    }

    @Override
    public void notifyAllObserver() {
        for(Observer o : observerList){
            o.update(price);
        }
    }

    public void start(){
        while(true){
            try{
                Thread.sleep(500);
            }catch (Exception exception){
                exception.printStackTrace();
            }
            //generating the next stock price
            price = price + 2 * random.nextFloat() - 1;
            notifyAllObserver();
            System.out.println(price);
        }
    }

}
