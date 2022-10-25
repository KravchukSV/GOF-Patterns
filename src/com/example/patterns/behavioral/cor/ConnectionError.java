package com.example.patterns.behavioral.cor;

public class ConnectionError extends ErrorWebsite{
    public ConnectionError(int levelError) {
        super(levelError);
    }

    @Override
    public void writeError(String message) {
        System.out.println("Connection: " + message);
    }
}
