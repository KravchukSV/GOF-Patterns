package com.example.patterns.creational.builder;

public class Laptop {
    private String name;
    private TypeDisplay typeDisplay;
    private LaptopProcessor laptopProcessor;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeDisplay(TypeDisplay typeDisplay) {
        this.typeDisplay = typeDisplay;
    }

    public void setLaptopProcessor(LaptopProcessor laptopProcessor) {
        this.laptopProcessor = laptopProcessor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", typeDisplay=" + typeDisplay +
                ", laptopProcessor=" + laptopProcessor +
                ", price=" + price +
                '}';
    }
}
