package org.example.SchoolProject.entity;

import java.util.ArrayList;
import java.util.List;

public class Applicant extends User{
    public static List<Applicant> listOfApplicant = new ArrayList<>();
    int applicantScore;
    String courseApplied;

//    public Applicant(int applicantScore, String courseApplied) {
//        this.applicantScore = applicantScore;
//        this.courseApplied = courseApplied;
//    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantScore=" + applicantScore +
                ", courseApplied='" + courseApplied + '\'' +
                '}';
    }


    public int getApplicantScore() {
        return applicantScore;
    }

    public void setApplicantScore(int applicantScore) {
        this.applicantScore = applicantScore;
    }

    public String getCourseApplied() {
        return courseApplied;
    }

    public void setCourseApplied(String courseApplied) {
        this.courseApplied = courseApplied;
    }

}
