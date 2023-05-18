package com.example.test_javafx.models;

public class Instructor extends User {
    private String course;

    public Instructor(String username, String password, String course) {
        super(username, password);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void addLecture(String title, String location) {
        // Code to add a new lecture to the instructor's course
    }

    public void editLecture(String title, String newLocation) {
        // Code to edit an existing lecture of the instructor's course
    }

    public void recordAttendance(String studentId, boolean present) {
        // Code to record attendance of a student in the instructor's course
    }

    public void importAttendance(String filePath) {
        // Code to import attendance from a file for the instructor's course
    }

    public void generateAttendanceReport() {
        // Code to generate the attendance report for the instructor's course
    }
}
