package com.example.patterns.behavioral.strategy;

public class FormulaBrzycki implements Calculation{
    @Override
    public double calculate(double weight, int repeat) {
        return weight*36/(37-repeat);
    }
}
