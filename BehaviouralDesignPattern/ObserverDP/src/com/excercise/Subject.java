package com.excercise;

public interface Subject {
    public void addObservers(Observer o);
    public void notifyAllObserver();
}
