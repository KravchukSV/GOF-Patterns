package com.example.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class FreelanceSite {
    private List<MyObserver> observerList = new ArrayList<>();
    private List<String> taskList = new ArrayList<>();

    public void addObserver(MyObserver observer){
        observerList.add(observer);
    }

    public void removeObserver(MyObserver observer){
        observerList.remove(observer);
    }

    public void addTask(String task){
        taskList.add(task);
        informObserver();
    }

    public void removeTask(String task){
        taskList.remove(task);
        informObserver();
    }

    private void informObserver(){
        for(MyObserver observer : observerList){
            observer.event(taskList);
        }
    }
}
