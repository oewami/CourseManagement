package com.nuintel;

import java.util.ArrayList;

public class Instructor extends Account {

    private ArrayList<Course> courses = new ArrayList<>();
    // TODO check students homework
    // TODO grade students homework

    public void register (String firstName, String lastName, String username, String password) {
        super.register(firstName, lastName, username, password);

        Administrator.addPendingInstructor(this);
    }
}
