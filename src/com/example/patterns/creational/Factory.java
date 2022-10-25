package com.example.patterns.creational;

import com.example.patterns.creational.factory.*;

public class Factory {
    public static void main(String[] args) {
        PersonFactory personFactory = createPersonByCountry("ua");
        Person person = personFactory.createPerson();

        person.greeting();
    }

    static PersonFactory createPersonByCountry(String country){
        if(country.equalsIgnoreCase("ua")){
            return new UaPersonFactory();
        }
        else if(country.equalsIgnoreCase("usa")){
            return new UsaPersonFactory();
        }
        else{
            throw new RuntimeException(country + " is unknown country.");
        }
    }
}