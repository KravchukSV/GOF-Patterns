package com.example.patterns.behavioral;

import com.example.patterns.behavioral.memento.TextEditor;

public class Memento {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.setText("Hello");
        textEditor.setColorText("green");
        textEditor.printText();
        textEditor.save();
        System.out.println();

        textEditor.setText("Hey");
        textEditor.setColorText("yellow");
        textEditor.printText();

        System.out.println();
        textEditor.restoreСolor();
        textEditor.printText();
    }
}
