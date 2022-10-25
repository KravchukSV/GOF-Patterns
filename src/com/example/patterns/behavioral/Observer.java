package com.example.patterns.behavioral;

import com.example.patterns.behavioral.observer.FreelanceSite;
import com.example.patterns.behavioral.observer.MyObserver;
import com.example.patterns.behavioral.observer.Performer;

public class Observer {
    public static void main(String[] args) {
        FreelanceSite freelanceSite = new FreelanceSite();
        MyObserver fastSloth = new Performer("fastSloth");
        MyObserver littleElephant = new Performer("littleElephant");

        freelanceSite.addObserver(fastSloth);
        freelanceSite.addTask("homework in physics");
        System.out.println();

        freelanceSite.addObserver(littleElephant);
        freelanceSite.addTask("write a program in Java");
        System.out.println();

        freelanceSite.removeObserver(littleElephant);
        freelanceSite.removeTask("homework in physics");


    }
}
