package com.excercise;

public class ImageManager {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void showImage(){
        this.strategy.showImage();
    }
}
