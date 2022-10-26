package com.example.patterns.behavioral;

import com.example.patterns.behavioral.strategy.FormulaBrzycki;
import com.example.patterns.behavioral.strategy.FormulaEpley;
import com.example.patterns.behavioral.strategy.FormulaWathan;
import com.example.patterns.behavioral.strategy.OneTimeMaximum;

public class Strategy {
    public static void main(String[] args) {
        double weight = 100;
        int repeat = 5;

        OneTimeMaximum oneTimeMaximum = new OneTimeMaximum();

        System.out.println("Formula Brzycki");
        oneTimeMaximum.setCalculation(new FormulaBrzycki());
        System.out.println(oneTimeMaximum.calculationWeight(weight, repeat));

        System.out.println("\nFormula Epley");
        oneTimeMaximum.setCalculation(new FormulaEpley());
        System.out.println(oneTimeMaximum.calculationWeight(weight, repeat));

        System.out.println("\nFormula Wathan");
        oneTimeMaximum.setCalculation(new FormulaWathan());
        System.out.println(oneTimeMaximum.calculationWeight(weight, repeat));
    }
}
