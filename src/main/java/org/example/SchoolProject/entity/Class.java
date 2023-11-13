package org.example.SchoolProject.entity;

public class Class {
    String className;
    String StartDate;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Class(String className, String startDate, String location, String teacher) {
        this.className = className;
        StartDate = startDate;
        this.location = location;
        this.teacher = teacher;
    }

    String location;
    String teacher;
}
