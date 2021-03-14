package com.nuintel;

import java.io.File;

public class Student extends Account{

    private String id;

    public void register (String firstName, String lastName, String username, String password) {
        super.register(firstName, lastName, username, password);

        Administrator.addPendingStudent(this);
    }

    public String submitHomework(Course course, File file) {
    // TODO submit homework
        return "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
