package com.problem.SingleResponsibilityDP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static final int THRESHOLD = 5;

    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");
        List<Integer> userInputList = userInputList();
        Collections.sort(userInputList);
        printList(userInputList);
    }

    public static List<Integer> userInputList(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        while(nums.size() < THRESHOLD) {

            String s = scanner.nextLine();

            try {
                Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again!");
                continue;
            }

            int num = Integer.parseInt(s);

            if(num<0 || num > 10) {
                System.out.println("Invalid range! Try again!");
                continue;
            }

            nums.add(num);
        }

        scanner.close();
        return nums;
    }

    public static void printList(List<Integer> nums){
        for(Integer num: nums){
            System.out.println(num + " ");
        }
    }
}
