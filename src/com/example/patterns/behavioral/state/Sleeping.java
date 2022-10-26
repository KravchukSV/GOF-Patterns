package com.example.patterns.behavioral.state;

public class Sleeping implements Action{
    @Override
    public void action() {
        System.out.println("Sleeping...");
    }
}
