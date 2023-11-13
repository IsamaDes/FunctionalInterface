package org.example.SchoolProject.entity;

import java.math.BigDecimal;

public class NonAcademicStaff extends User {
    String employeeIDNumber;

    @Override
    public String toString() {
        return "NonAcademicStaff{" +
                "employeeIDNumber='" + employeeIDNumber + '\'' +
                ", Supervisor='" + Supervisor + '\'' +
                ", performanceRatings='" + performanceRatings + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getEmployeeIDNumber() {
        return employeeIDNumber;
    }

    public void setEmployeeIDNumber(String employeeIDNumber) {
        this.employeeIDNumber = employeeIDNumber;
    }

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String supervisor) {
        Supervisor = supervisor;
    }

    public String getPerformanceRatings() {
        return performanceRatings;
    }

    public void setPerformanceRatings(String performanceRatings) {
        this.performanceRatings = performanceRatings;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    String Supervisor;

    public NonAcademicStaff(String employeeIDNumber, String supervisor, String performanceRatings, BigDecimal salary) {
        this.employeeIDNumber = employeeIDNumber;
        Supervisor = supervisor;
        this.performanceRatings = performanceRatings;
        this.salary = salary;
    }

    String performanceRatings;
    BigDecimal salary;
}
