package org.example.SchoolProject.entity;

import java.math.BigDecimal;

public class Principal extends User {
    String yearsOfExperience;
    String certification;

    @Override
    public String toString() {
        return "Principal{" +
                "yearsOfExperience='" + yearsOfExperience + '\'' +
                ", certification='" + certification + '\'' +
                ", specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Principal(String yearsOfExperience, String certification, String specialization, BigDecimal salary) {
        this.yearsOfExperience = yearsOfExperience;
        this.certification = certification;
        this.specialization = specialization;
        this.salary = salary;
    }

    String specialization;
    BigDecimal salary;
}
