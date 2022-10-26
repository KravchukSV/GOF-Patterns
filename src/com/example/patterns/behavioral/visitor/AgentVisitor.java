package com.example.patterns.behavioral.visitor;

public interface AgentVisitor {
    void visit(FamilyHome familyHome);
    void visit(Bank bank);
    void visit(Factory factory);
}
