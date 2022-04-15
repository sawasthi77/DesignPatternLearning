package com.example;

public class App {
    public static void main(String args[]){
        Person person = new Person.Builder("sam", "sam@gmail.com").build();
        System.out.println(person.toString());
    }
}
