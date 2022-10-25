package com.example.patterns.creational;

import com.example.patterns.creational.singleton.MyServer;

public class Singleton {
    public static void main(String[] arg){
        System.out.println(MyServer.getInstance());
        System.out.println(MyServer.getInstance());
        System.out.println(MyServer.getInstance());
        System.out.println(MyServer.getInstance());
    }
}
