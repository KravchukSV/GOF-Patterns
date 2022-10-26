package com.example.patterns.behavioral.state;

public class Student {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void changeAction(){
        if(action instanceof Sleeping){
            action = new IsStudying();
        }
        else if(action instanceof IsStudying){
            action = new Walks();
        }
        else if(action instanceof Walks){
            action = new Sleeping();
        }
    }

    public void actionStudent(){
        action.action();
    }
}
