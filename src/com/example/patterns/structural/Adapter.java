package com.example.patterns.structural;

import com.example.patterns.structural.adapter.AndroidProgram;
import com.example.patterns.structural.adapter.AndroidToWin;

public class Adapter {
    public static void main(String[] arg){
        AndroidProgram androidProgram = new AndroidToWin();

        androidProgram.touchControl();
    }
}
