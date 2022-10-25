package com.example.patterns.creational;

import com.example.patterns.creational.builder.*;

public class Builder {
    public static void main(String[] arg){
        Director director = new Director();

        director.setLaptopBuilder(new GamingLaptop());
        Laptop laptop = director.buildLaptop();

        System.out.println(laptop);
    }
}
