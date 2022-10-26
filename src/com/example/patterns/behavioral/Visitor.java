package com.example.patterns.behavioral;

import com.example.patterns.behavioral.visitor.AgentBuildingVisitor;
import com.example.patterns.behavioral.visitor.Building;
import com.example.patterns.behavioral.visitor.InsuranceBuildings;

public class Visitor {
    public static void main(String[] args) {
        Building building = new InsuranceBuildings();
        building.accept(new AgentBuildingVisitor());
    }
}
