package com.example.patterns.structural;

import com.example.patterns.structural.composite.Armchair;
import com.example.patterns.structural.composite.Bed;
import com.example.patterns.structural.composite.Furniture;
import com.example.patterns.structural.composite.Products;

public class Composite {
    public static void main(String[] arg){
        Furniture bed = new Bed();
        Furniture armchair = new Armchair();

        Products products = new Products();
        Products newProducts = new Products();

        newProducts.addFurniture(armchair);

        products.addFurniture(newProducts);
        products.addFurniture(bed);
        products.addFurniture(armchair);

        products.production();
    }
}
