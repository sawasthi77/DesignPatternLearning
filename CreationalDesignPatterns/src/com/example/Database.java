package com.example;

public enum Database {
    // This instance is thread safe
    INSTANCE;

    public void connect(){
        System.out.println("Connecting to the database");
    }

    public void disconnect(){
        System.out.println("Dis connecting the database");
    }
}
