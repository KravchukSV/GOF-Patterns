package com.example.patterns.structural.bridge;

public class Game extends Program{

    public Game(Developer developer) {
        super(developer);
    }
    @Override
    public void developerProgram() {
        System.out.println("Game developer in progress...");
        developer.writeCode();
    }
}
