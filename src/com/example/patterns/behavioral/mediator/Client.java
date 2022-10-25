package com.example.patterns.behavioral.mediator;

public class Client {
    BankingProgram bankingProgram;
    private String name;
    private int loanAmount;

    public Client(BankingProgram bankingProgram, String name, int loanAmount) {
        this.bankingProgram = bankingProgram;
        this.name = name;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void loanApproval(String message){
        System.out.println(name + ": " + message);
    }

    public void credit(){
        bankingProgram.loanProcessing(this);
    }
}
