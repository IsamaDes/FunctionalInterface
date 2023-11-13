package org.example.SchoolProject.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public static List<Course> listOfCourse = new ArrayList<>();
    private String grade;

    @Override
    public String toString() {
        return "Course{" +
                "grade='" + grade + '\'' +
                ", courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseInstructor='" + courseInstructor + '\'' +
                ", acceptedScore=" + acceptedScore +
                '}';
    }

    private String courseID;

    public static List<Course> getListOfCourse() {
        return listOfCourse;
    }

    public static void setListOfCourse(List<Course> listOfCourse) {
        Course.listOfCourse = listOfCourse;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getCourseName() {
        return courseName;
    }

    public void setCourseName(int courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public boolean isAcceptedScore() {
        return acceptedScore;
    }

    public void setAcceptedScore(boolean acceptedScore) {
        this.acceptedScore = acceptedScore;
    }

//    public Course(String grade, String courseID, int courseName, String courseInstructor, boolean acceptedScore) {
//        this.grade = grade;
//        this.courseID = courseID;
//        this.courseName = courseName;
//        this.courseInstructor = courseInstructor;
//        this.acceptedScore = acceptedScore;
//    }

    private int courseName;

//    public Course(int courseName) {
//        this.courseName = courseName;
//    }

    private String courseInstructor;
    boolean acceptedScore;
}
