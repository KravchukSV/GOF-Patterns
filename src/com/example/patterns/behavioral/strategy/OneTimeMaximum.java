package com.example.patterns.behavioral.strategy;

public class OneTimeMaximum {
    private Calculation calculation;

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public double calculationWeight(double weight, int repeat){
        return calculation.calculate(weight, repeat);
    }

}
