package com.example.patterns.creational.abstractfactory.android;

import com.example.patterns.creational.abstractfactory.Developer;

public class AndroidDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Android developer writes code...");
    }
}
