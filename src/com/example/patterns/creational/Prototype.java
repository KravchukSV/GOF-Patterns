package com.example.patterns.creational;

import com.example.patterns.creational.prototype.Headphone;

public class Prototype {
    public static void main(String[] arg){
        Headphone topHeadphone = new Headphone("Orange", 10, 20000, true);

        System.out.println(topHeadphone);

        Headphone topHeadphoneClone = (Headphone) topHeadphone.copy();
        System.out.println(topHeadphoneClone);

        System.out.println("\ncopy topHeadphone\n");
        System.out.println(topHeadphoneClone);
    }
}
