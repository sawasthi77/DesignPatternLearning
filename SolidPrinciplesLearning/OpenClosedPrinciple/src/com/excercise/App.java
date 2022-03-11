package com.excercise;

public class App {
    public static void main(String args[]){
        SorterProcessor.process(new InsertionSort());
        SorterProcessor.process(new SelectionSort());
        SorterProcessor.process(new MergeSort());
    }
}
