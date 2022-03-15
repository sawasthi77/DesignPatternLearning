package com.example;

public class App {

    public static void main(String args[]){
        DatabaseController controller = new DatabaseController(new MySql());
        controller.connect();
        controller.disconnect();
    }
}
