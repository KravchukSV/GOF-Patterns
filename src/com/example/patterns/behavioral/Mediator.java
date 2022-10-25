package com.example.patterns.behavioral;

import com.example.patterns.behavioral.mediator.BankDirector;
import com.example.patterns.behavioral.mediator.BankingProgram;
import com.example.patterns.behavioral.mediator.Client;

public class Mediator {
    public static void main(String[] args) {
        BankingProgram bankingProgram = new BankingProgram();

        BankDirector bankDirector = new BankDirector(bankingProgram);
        Client adam = new Client(bankingProgram,"Adam", 1000);
        Client jon = new Client(bankingProgram, "Jon", 2000);

        bankingProgram.setBankDirector(bankDirector);
        bankingProgram.addClient(adam);
        bankingProgram.addClient(jon);

        adam.credit();
        System.out.println();
        jon.credit();
        System.out.println();
        bankDirector.loanApproval("Adam");
    }
}
