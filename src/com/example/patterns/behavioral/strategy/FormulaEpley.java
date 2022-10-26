package com.example.patterns.behavioral.strategy;

public class FormulaEpley implements Calculation{
    @Override
    public double calculate(double weight, int repeat) {
        return weight*(1+repeat/30.0);
    }
}
