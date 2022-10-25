package com.example.patterns.creational.builder;

public class GamingLaptop extends LaptopBuilder{
    @Override
    void buildName() {
        laptop.setName("MSI");
    }

    @Override
    void buildTypeDisplay() {
        laptop.setTypeDisplay(TypeDisplay.IPS);
    }

    @Override
    void buildLaptopProcessor() {
        laptop.setLaptopProcessor(LaptopProcessor.AMD);
    }

    @Override
    void buildPrice() {
        laptop.setPrice(1500);
    }
}
