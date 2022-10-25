package com.example.patterns.structural;

import com.example.patterns.structural.bridge.Game;
import com.example.patterns.structural.bridge.JavaDeveloper;
import com.example.patterns.structural.bridge.Program;

public class Bridge {
    public static void main(String[] arg){
        Program program = new Game(new JavaDeveloper());

        program.developerProgram();

    }
}
