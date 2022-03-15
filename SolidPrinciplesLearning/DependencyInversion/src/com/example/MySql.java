package com.example;
//low level module
public class MySql implements Database {
    @Override
    public void connect(){
        System.out.println("Connecting to the database");
    }
    @Override
    public void disconnect(){
        System.out.println("Disconnecting to the database");
    }
}
