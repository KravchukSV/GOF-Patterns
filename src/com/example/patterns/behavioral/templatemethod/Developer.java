package com.example.patterns.behavioral.templatemethod;

public abstract class Developer {
    public final void writeProgram(){
        System.out.println("The developer analyzes the task...");

        writeCode();

        System.out.println("The developer submits the program for testing...");

    }

    abstract void writeCode();
}
