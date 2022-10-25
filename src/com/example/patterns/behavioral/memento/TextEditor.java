package com.example.patterns.behavioral.memento;

public class TextEditor {

    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";

    private Memento backupСopy;
    private String text;
    private String colorText = "";

    public void setText(String text) {
        this.text = text;
    }

    public void setColorText(String colorText) {
        switch (colorText){
            case "blake":
                this.colorText = ANSI_BLACK;
                break;
            case "red":
                this.colorText = ANSI_RED;
                break;
            case "green":
                this.colorText = ANSI_GREEN;
                break;
            case "yellow":
                this.colorText = ANSI_YELLOW;
                break;
            case "blue":
                this.colorText = ANSI_BLUE;
                break;
        }
    }

    public void printText(){
        System.out.println(colorText + text);
    }

    public void save(){
        backupСopy = new Memento(this.text, this.colorText);
    }

    public void restoreСolor(){
        this.colorText = backupСopy.getColorText();
    }

    public void restoreText(){
        this.text = backupСopy.getText();
    }

    private class Memento{
        private final String text;
        private final String colorText;

        public Memento(String text, String colorText) {
            this.text = text;
            this.colorText = colorText;
        }

        public String getText() {
            return text;
        }

        public String getColorText() {
            return colorText;
        }
    }
}
