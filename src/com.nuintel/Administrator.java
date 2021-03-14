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

    public ArrayList<Student> getPendingStudents() {
        return pendingStudents;
    }

    public ArrayList<Instructor> getPendingInstructors() {
        return pendingInstructors;
    }

    public void approveAccount(Student student) {
        student.setApproved();
        pendingStudents.remove(student);
        // TODO set id for student
        // TODO add account to database
        approvedStudents.add(student);
    }

    public void approveAccount(Instructor instructor) {
        instructor.setApproved();
        pendingInstructors.remove(instructor);
        // TODO set id for instructor
        // TODO add account to database
        approvedInstructors.add(instructor);
    }


}
