package com.example;

public class App {
    public static void main(String args[]){
        WeatherStation station = new WeatherStation();
        WeatherObserver observer1 = new WeatherObserver(station);
        station.setPressure(760);
        station.setTemp(30);
        station.setHumidity(1000);

        System.out.println("Finally the updated values are ");
        observer1.showData();
    }
}
