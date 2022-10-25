package com.example.patterns.behavioral;

import com.example.patterns.behavioral.interpreter.AndExpression;
import com.example.patterns.behavioral.interpreter.Expression;
import com.example.patterns.behavioral.interpreter.OrExpression;
import com.example.patterns.behavioral.interpreter.TerminalExpression;

public class Interpreter {
    public static void main(String[] args) {
        Expression ua = new TerminalExpression("Ukrainian");
        Expression en = new TerminalExpression("English");

        Expression uaOrEn = new OrExpression(ua, en);
        Expression uaAndEn = new AndExpression(ua, en);

        System.out.println(uaOrEn.interpret("Ukrainian"));
        System.out.println(uaAndEn.interpret("Ukrainian, English"));
    }
}
