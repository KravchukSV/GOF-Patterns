package com.example.patterns.behavioral.cor;

public class AuthorizationError extends ErrorWebsite{

    public AuthorizationError(int levelError) {
        super(levelError);
    }

    @Override
    public void writeError(String message) {
        System.out.println("Authorization: " + message);
    }
}
