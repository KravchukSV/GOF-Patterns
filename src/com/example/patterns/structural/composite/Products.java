package com.example.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Products implements Furniture{

    private List<Furniture> furnitureList = new ArrayList<>();

    @Override
    public void production() {
        for(Furniture furniture:furnitureList){
            furniture.production();
        }
    }

    public void addFurniture(Furniture furniture){
        this.furnitureList.add(furniture);
    }

    public void clear(){
        this.furnitureList.clear();
    }
}
