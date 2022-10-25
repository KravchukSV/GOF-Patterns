package com.example.patterns.behavioral.mediator;

public class BankDirector {
    BankingProgram bankingProgram;
    public BankDirector(BankingProgram bankingProgram) {
        this.bankingProgram = bankingProgram;
    }

    public void loanRequest(String message){
        System.out.println("Bank director: " + message);
    }

    public void loanApproval(String name){
        bankingProgram.loanApproval(name, "The bank approved the loan");
    }
}
