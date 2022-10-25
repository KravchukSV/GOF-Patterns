package com.example.patterns.structural.adapter;

public class AndroidToWin extends WinProgram implements AndroidProgram{
    @Override
    public void touchControl() {
        keyboardControl();
    }
}
