package org.example.SchoolProject.entity;

import org.example.SchoolProject.Enum.Role;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private static List<Teacher> listOfTeacher = new ArrayList<>();
    private Role role;
    private int CourseAssigned;
    private String email;

    @Override
    public String toString() {
        return "Teacher{" +
                "role=" + role +
                ", CourseAssigned=" + CourseAssigned +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", TeacherIdNumber='" + TeacherIdNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static List<Teacher> getListOfTeacher() {
        return listOfTeacher;
    }

    public static void setListOfTeacher(List<Teacher> listOfTeacher) {
        Teacher.listOfTeacher = listOfTeacher;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getCourseAssigned() {
        return CourseAssigned;
    }

    public void setCourseAssigned(int courseAssigned) {
        CourseAssigned = courseAssigned;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getTeacherIdNumber() {
        return TeacherIdNumber;
    }

    public void setTeacherIdNumber(String teacherIdNumber) {
        TeacherIdNumber = teacherIdNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private BigDecimal salary;
    private String TeacherIdNumber;
    private String firstName;
    private String lastName;

}
