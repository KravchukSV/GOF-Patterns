package com.example.patterns.behavioral;

import com.example.patterns.behavioral.templatemethod.Developer;
import com.example.patterns.behavioral.templatemethod.PythonDeveloper;
import com.example.patterns.behavioral.templatemethod.SwiftDeveloper;

public class TemplateMethod {
    public static void main(String[] args) {

        Developer pythonDeveloper = new PythonDeveloper();
        Developer swiftDeveloper = new SwiftDeveloper();

        pythonDeveloper.writeProgram();

        System.out.println();

        swiftDeveloper.writeProgram();
    }
}
