package com.example.patterns.structural.bridge;

public class Website extends Program{
    protected Website(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProgram() {
        System.out.println("Website developer in progress...");
        developer.writeCode();
    }
}
