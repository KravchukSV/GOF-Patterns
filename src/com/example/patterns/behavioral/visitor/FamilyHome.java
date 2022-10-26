package com.example.patterns.behavioral.visitor;

public class FamilyHome implements Building{
    @Override
    public void accept(AgentVisitor agentVisitor) {
        agentVisitor.visit(this);
    }
}
