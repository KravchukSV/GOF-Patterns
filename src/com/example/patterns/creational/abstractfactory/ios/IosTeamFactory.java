package com.example.patterns.creational.abstractfactory.ios;

import com.example.patterns.creational.abstractfactory.Developer;
import com.example.patterns.creational.abstractfactory.ProjectManager;
import com.example.patterns.creational.abstractfactory.ProjectTeamFactory;
import com.example.patterns.creational.abstractfactory.Tester;

public class IosTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new IosDeveloper();
    }

    @Override
    public Tester getTester() {
        return new IosTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new IosProjectManager();
    }
}
