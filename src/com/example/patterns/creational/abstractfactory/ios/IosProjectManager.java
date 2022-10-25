package com.example.patterns.creational.abstractfactory.ios;

import com.example.patterns.creational.abstractfactory.ProjectManager;

public class IosProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Ios project manager manages ios project...");
    }
}
