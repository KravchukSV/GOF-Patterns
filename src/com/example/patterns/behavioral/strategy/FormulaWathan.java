package com.example.patterns.behavioral.strategy;

public class FormulaWathan implements Calculation{
    @Override
    public double calculate(double weight, int repeat) {
        return (100*weight)/(48.8 + 53.8*Math.exp(-0.075*repeat));
    }
}
