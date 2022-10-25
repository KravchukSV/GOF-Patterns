package com.example.patterns.creational.factory;

public class UaPersonFactory implements PersonFactory {

    @Override
    public Person createPerson() {
        return new UaPerson();
    }
}
