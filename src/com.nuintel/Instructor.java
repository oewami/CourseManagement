package com.nuintel;

import java.util.ArrayList;
import java.io.File;

public class Instructor extends Account {

    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<File> hwToGrade = new ArrayList<>();
    // TODO check students homework
    // TODO grade students homework

    public void register (String firstName, String lastName, String username, String password) {
        super.register(firstName, lastName, username, password);

        Administrator.addPendingInstructor(this);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<File> getHwToGrade() {
        return hwToGrade;
    }
}
