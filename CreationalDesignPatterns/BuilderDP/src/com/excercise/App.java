package com.excercise;

public class App {
    public static void main(String args[]){
        Student student = new Student.Builder("walter white", "Meth").setAge(50).build();
        System.out.println(student.toString());
    }
}
