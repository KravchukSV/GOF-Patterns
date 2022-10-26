package com.example.patterns.behavioral.visitor;

public class InsuranceBuildings implements Building{

    private Building[] buildings;

    public InsuranceBuildings() {
        buildings = new Building[]{new FamilyHome(), new Bank(), new Factory()};
    }

    @Override
    public void accept(AgentVisitor agentVisitor) {
        for(int i = 0; i < buildings.length; i++){
            buildings[i].accept(agentVisitor);
        }
    }
}
