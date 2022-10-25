package com.example.patterns.creational.factory;

public class UsaPersonFactory implements PersonFactory{
    @Override
    public Person createPerson() {
        return new UsaPerson();
    }
}
