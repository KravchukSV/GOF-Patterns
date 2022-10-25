package com.example.patterns.creational.builder;

public class Director {
    LaptopBuilder laptopBuilder;

    public void setLaptopBuilder(LaptopBuilder laptopBuilder){
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop buildLaptop(){
        laptopBuilder.creatLaptop();
        laptopBuilder.buildName();
        laptopBuilder.buildTypeDisplay();
        laptopBuilder.buildLaptopProcessor();
        laptopBuilder.buildPrice();

        Laptop laptop = laptopBuilder.getLaptop();
        return laptop;
    }
}
