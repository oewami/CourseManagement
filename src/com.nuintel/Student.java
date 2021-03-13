package com.nuintel;

public class Student extends Account{
    // TODO submit homework

    public void register (String firstName, String lastName, String username, String password) {
        super.register(firstName, lastName, username, password);

        Administrator.addPendingStudent(this);
    }

}
