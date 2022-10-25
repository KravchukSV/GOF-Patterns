package com.example.patterns.creational.builder;

public abstract class LaptopBuilder {
    Laptop laptop;

    void creatLaptop(){
        laptop = new Laptop();
    }

    abstract void buildName();
    abstract void buildTypeDisplay();
    abstract void buildLaptopProcessor();
    abstract void buildPrice();

    Laptop getLaptop(){
        return laptop;
    }
}
