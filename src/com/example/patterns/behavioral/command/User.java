package com.example.patterns.behavioral.command;

import java.util.HashMap;

public class User {
    private final HashMap<String, VideoCommand> commandMap = new HashMap<>();

    public void register(String commandName, VideoCommand command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        VideoCommand command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute();
    }
}
