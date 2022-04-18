package com.example;

public class App {
    public static void main(String args[]){
        Switcher switcher = new Switcher();
        Light light = new Light();
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);

        switcher.addCommand(turnOffCommand);
        switcher.addCommand(turnOnCommand);

        switcher.executeCommands();
    }
}
