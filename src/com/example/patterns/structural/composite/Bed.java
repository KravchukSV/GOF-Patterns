package com.example.patterns.structural.composite;

public class Bed implements Furniture{
    @Override
    public void production() {
        System.out.println("Making a bed...");
    }
}