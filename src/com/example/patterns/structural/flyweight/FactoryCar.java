package com.example.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryCar {
    private Map<EngineType, Car> cars = new HashMap<>();

    public Car createCar(EngineType engine){
        Car car = cars.get(engine);

        if(car == null){
            switch (engine){
                case ELECTRIC:
                    System.out.println("Create electric car...");
                    car = new Car(EngineType.ELECTRIC);
                    break;
                case DIESEL:
                    System.out.println("Create diesel car...");
                    car = new Car(EngineType.DIESEL);
                    break;
                case GASOLINE:
                    System.out.println("Create gasoline car...");
                    car = new Car(EngineType.GASOLINE);
                    break;
            }
        }
        cars.put(engine, car);
        return car;
    }
}
