package com.example.patterns.structural.flyweight;

public class Car {
    EngineType engine;

    public Car(EngineType engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
