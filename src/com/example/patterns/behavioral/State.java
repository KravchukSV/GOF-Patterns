package com.example.patterns.behavioral;

import com.example.patterns.behavioral.state.Action;
import com.example.patterns.behavioral.state.Sleeping;
import com.example.patterns.behavioral.state.Student;

public class State {
    public static void main(String[] args) {
        Student student = new Student();

        Action action = new Sleeping();

        student.setAction(action);

        student.actionStudent();
        student.changeAction();
        student.actionStudent();
    }
}
