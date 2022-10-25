package com.example.patterns.creational.abstractfactory.ios;

import com.example.patterns.creational.abstractfactory.Developer;

public class IosDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Ios developer writes ios code...");
    }
}
