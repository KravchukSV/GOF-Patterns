package com.example.patterns.structural.decorator;

public class RadioAdvertising implements Advertising{
    @Override
    public void advertise() {
        System.out.println("radio advertising...");
    }
}
