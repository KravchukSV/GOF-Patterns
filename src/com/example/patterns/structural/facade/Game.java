package com.example.patterns.structural.facade;

public class Game implements CreateGame{
    private GameDeveloper gameDeveloper;
    private GameDesigner gameDesigner;
    private GameTester gameTester;

    public Game() {
        gameDeveloper = new GameDeveloper();
        gameDesigner = new GameDesigner();
        gameTester = new GameTester();
    }

    @Override
    public void create() {
        gameDeveloper.writeCode();
        gameDesigner.createDesign();
        gameTester.testGame();
    }
}
