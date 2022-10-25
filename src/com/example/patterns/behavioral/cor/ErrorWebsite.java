package com.example.patterns.behavioral.cor;

public abstract class ErrorWebsite {
    private ErrorWebsite errorWebsite;
    private int levelError;

    public ErrorWebsite(int levelError) {
        this.levelError = levelError;
    }

    public void nextLevelError(ErrorWebsite errorWebsite){
        this.errorWebsite = errorWebsite;
    }

    public void errorManager(String messageErr, int level){
        if(level <= levelError){
            writeError(messageErr);
            if(errorWebsite != null){
                errorWebsite.errorManager(messageErr, level);
            }
        }
    }

    public abstract void writeError(String message);
}
