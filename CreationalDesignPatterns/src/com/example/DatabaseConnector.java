package com.example;

public class DatabaseConnector {
    //eager version no matter what we need to create instance
    public static DatabaseConnector INSTANCE ;

    // instantiation of the class cannot be done
    private DatabaseConnector(){

    }

    public static DatabaseConnector getInstance(){
        if(INSTANCE == null){
            synchronized (DatabaseConnector.class){
                INSTANCE = new DatabaseConnector();
            }
        }
        return INSTANCE;
    }

    public void connect(){
        System.out.println("Connecting to the database");
    }

    public void disconnect(){
        System.out.println("Disconnecting to the database");
    }
}
