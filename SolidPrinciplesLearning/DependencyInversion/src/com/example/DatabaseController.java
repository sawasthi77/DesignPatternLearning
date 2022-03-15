package com.example;

public class DatabaseController {
    // We program to an interface to achieve loosely coupled architecture
    private Database database;

    public DatabaseController(Database database){
        this.database = database;
    }

    public void connect(){
        this.database.connect();
    }

    public void disconnect(){
        this.database.connect();
    }
}
