package com.example;

import java.util.ArrayList;
import java.util.List;
// Invoker
public class Switcher {

    public List<Command> commands;

    public Switcher(){
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        this.commands.add(command);
    }

    public void executeCommands(){
        for(Command c : commands){
            c.execute();
        }
    }
}
