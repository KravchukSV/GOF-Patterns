package com.example.patterns.creational;

import com.example.patterns.creational.abstractfactory.Developer;
import com.example.patterns.creational.abstractfactory.ProjectManager;
import com.example.patterns.creational.abstractfactory.ProjectTeamFactory;
import com.example.patterns.creational.abstractfactory.Tester;
import com.example.patterns.creational.abstractfactory.android.AndroidTeamFactory;
import com.example.patterns.creational.abstractfactory.ios.IosTeamFactory;

public class AbstractFactory {
    public static void main(String[] arg){
        mobileProgram("ios");
    }

    public static void mobileProgram(String os){
        ProjectTeamFactory projectTeamFactory;
        if(os.equalsIgnoreCase("android")){
            projectTeamFactory = new AndroidTeamFactory();
        }
        else if(os.equalsIgnoreCase("ios")){
            projectTeamFactory = new IosTeamFactory();
        }
        else{
            throw new RuntimeException(os + " is unknown os.");
        }
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
