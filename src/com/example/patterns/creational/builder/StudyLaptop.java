package com.example.patterns.creational.builder;

public class StudyLaptop extends LaptopBuilder{
    @Override
    void buildName() {
        laptop.setName("Lenovo");
    }

    @Override
    void buildTypeDisplay() {
        laptop.setTypeDisplay(TypeDisplay.TFT);
    }

    @Override
    void buildLaptopProcessor() {
        laptop.setLaptopProcessor(LaptopProcessor.Intel);
    }

    @Override
    void buildPrice() {
        laptop.setPrice(400);
    }
}
