package com.example.patterns.behavioral.visitor;

public interface Building {
    void accept(AgentVisitor agentVisitor);
}
