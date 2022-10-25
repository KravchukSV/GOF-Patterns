package com.example.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class BankingProgram {

    private BankDirector bankDirector;

    private List<Client> clients = new ArrayList<>();

    public void loanProcessing(Client client){
        String message = client.getName() + " issued a loan for $" + client.getLoanAmount();
        System.out.println(message);
        bankDirector.loanRequest(message);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void setBankDirector(BankDirector bankDirector) {
        this.bankDirector = bankDirector;
    }

    public void loanApproval(String name, String message){
        for(Client client : clients){
            if(client.getName().equals(name)){
                client.loanApproval(message);
            }
        }
    }
}
