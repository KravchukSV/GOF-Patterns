package com.example.patterns.behavioral.observer;

import java.util.List;

public class Performer implements MyObserver{

    private String nickname;

    public Performer(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void event(List<String> strings) {
        System.out.println(nickname + ": changed task list...");
        System.out.println(strings);
    }
}
