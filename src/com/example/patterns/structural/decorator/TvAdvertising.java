package com.example.patterns.structural.decorator;

public class TvAdvertising implements Advertising{
    @Override
    public void advertise() {
        System.out.println("advertising on television...");
    }
}
