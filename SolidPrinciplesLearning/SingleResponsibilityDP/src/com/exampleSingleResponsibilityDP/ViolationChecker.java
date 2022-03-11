package com.exampleSingleResponsibilityDP;

public class ViolationChecker {
    public static boolean isValid(Pair pair){
        String first = pair.getFirst();
        String second = pair.getSecond();
        try{
            Integer.parseInt(first);
        }catch( NumberFormatException exception){
            System.out.println("The entered number is invalid");
            return false;
        }
        try{
            Integer.parseInt(second);
        }catch( NumberFormatException exception){
            System.out.println("The entered number is invalid");
            return false;
        }
        return true;
    }
}
