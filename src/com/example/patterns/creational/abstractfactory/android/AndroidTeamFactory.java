package com.example.patterns.creational.abstractfactory.android;

import com.example.patterns.creational.abstractfactory.Developer;
import com.example.patterns.creational.abstractfactory.ProjectManager;
import com.example.patterns.creational.abstractfactory.ProjectTeamFactory;
import com.example.patterns.creational.abstractfactory.Tester;

public class AndroidTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new AndroidDeveloper();
    }

    @Override
    public Tester getTester() {
        return new AndroidTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new AndroidProjectManager();
    }
}
