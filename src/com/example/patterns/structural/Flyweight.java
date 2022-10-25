package com.example.patterns.structural;

import com.example.patterns.structural.flyweight.Car;
import com.example.patterns.structural.flyweight.EngineType;
import com.example.patterns.structural.flyweight.FactoryCar;

import java.util.ArrayList;
import java.util.List;

public class Flyweight {
    public static void main(String[] arg){
        FactoryCar factoryCar = new FactoryCar();

        List<Car> cars = new ArrayList<>();

        cars.add(factoryCar.createCar(EngineType.GASOLINE));
        cars.add(factoryCar.createCar(EngineType.GASOLINE));
        cars.add(factoryCar.createCar(EngineType.GASOLINE));
        cars.add(factoryCar.createCar(EngineType.DIESEL));
        cars.add(factoryCar.createCar(EngineType.DIESEL));
        cars.add(factoryCar.createCar(EngineType.DIESEL));
        cars.add(factoryCar.createCar(EngineType.ELECTRIC));
        cars.add(factoryCar.createCar(EngineType.ELECTRIC));
        cars.add(factoryCar.createCar(EngineType.ELECTRIC));

        System.out.println();

        for(Car car:cars){
            System.out.println(car);
        }

    }
}
