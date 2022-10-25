package com.example.patterns.structural;

import com.example.patterns.structural.facade.CreateGame;
import com.example.patterns.structural.facade.Game;

public class Facade {
    public static void main(String[] arg){
        CreateGame createGame = new Game();

        createGame.create();
    }
}
