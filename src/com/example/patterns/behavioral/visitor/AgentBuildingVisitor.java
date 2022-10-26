package com.example.patterns.behavioral.visitor;

public class AgentBuildingVisitor implements AgentVisitor{
    @Override
    public void visit(FamilyHome familyHome) {
        System.out.println(agentVisited() + " Family house");
    }

    @Override
    public void visit(Bank bank) {
        System.out.println(agentVisited() + " Bank");
    }

    @Override
    public void visit(Factory factory) {
        System.out.println(agentVisited() + " Factory");
    }

    private String agentVisited(){
        return "Agent visited";
    }
}
