package com.example;

public class BubbleSort extends Algorithm{

    public BubbleSort(int[] nums) {
        super(nums);
    }

    @Override
    protected void initialise() {
        System.out.println("Initialising the Bubble Sort algorithm");
    }

    @Override
    protected void sorting() {
        for( int i = 0; i < nums.length; i ++)
            for(int j = 0; j < nums.length - i - 1; j ++)
                if(nums[j] > nums[j + 1])
                    swap(i , j);
    }

    @Override
    protected void showResult() {
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
