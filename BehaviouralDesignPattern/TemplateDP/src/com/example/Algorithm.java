package com.example;

public abstract class Algorithm {
    protected int[] nums;

    public Algorithm(int[] nums){
        this.nums = nums;
    }

    protected abstract void initialise();
    protected abstract void sorting();
    protected abstract void showResult();

    protected void swap(int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sort(){
        initialise();
        sorting();
        showResult();
    }

}
