package com.example;

public class App {

    public static void main(String args[]){
        int nums[] = {1, -2,-6, 9, 7, };

        Algorithm algorithm = new BubbleSort(nums);
        algorithm.sort();

    }
}
