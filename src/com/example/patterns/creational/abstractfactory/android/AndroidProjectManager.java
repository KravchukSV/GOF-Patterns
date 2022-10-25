package com.example.patterns.creational.abstractfactory.android;

import com.example.patterns.creational.abstractfactory.ProjectManager;

public class AndroidProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Android project manager manages game project...");
    }
}
