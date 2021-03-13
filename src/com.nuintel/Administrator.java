package com.nuintel;

import java.util.ArrayList;

public class Administrator extends Account{

    // TODO create/approve accounts for students and instructors
    // TODO post accounts to database
    protected boolean isApproved = true;
    private static ArrayList<Student> pendingStudents = new ArrayList<>();
    private static ArrayList<Instructor> pendingInstructors = new ArrayList<>();
    private static ArrayList<Student> approvedStudents = new ArrayList<>();
    private static ArrayList<Instructor> approvedInstructors = new ArrayList<>();

    public static void addPendingStudent(Student student) {
        pendingStudents.add(student);
    }

    public static void addPendingInstructor(Instructor instructor) {
        pendingInstructors.add(instructor);
    }


}
