package com.example.patterns.creational.singleton;

import java.util.Random;

public class MyServer {
    private static String url = "myServer";
    private static int countClients;
    private static MyServer myServer;

    private MyServer(){
        Random random = new Random();
        url = url + random.nextInt(1000) + ".com";
    }

    public static MyServer getInstance(){
        addClient();
        if(myServer == null){
            myServer = new MyServer();
        }
        return myServer;
    }

    private static void addClient(){
        countClients++;
    }

    @Override
    public String toString() {
        return "MyServer{" +
                "url=" + url +
                "countClients=" + countClients +
                "}";
    }
}
