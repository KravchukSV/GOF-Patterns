package com.example.patterns.behavioral;

import com.example.patterns.behavioral.cor.AuthorizationError;
import com.example.patterns.behavioral.cor.ConnectionError;
import com.example.patterns.behavioral.cor.ErrorWebsite;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        ErrorWebsite connectionError = new ConnectionError(3);
        ErrorWebsite authorizationError = new AuthorizationError(5);

        authorizationError.nextLevelError(connectionError);

        authorizationError.errorManager("connection error...", 3);
        System.out.println();
        authorizationError.errorManager("authorization error...", 5);

        authorizationError.errorManager("authorization error...", 7);
    }
}
