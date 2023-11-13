package org.example.SchoolProject.staffServiceImp;


import org.example.SchoolProject.entity.*;
import org.example.SchoolProject.Enum.Role;
import org.example.SchoolProject.staffServices.StaffInterface;
import org.example.SchoolProject.staffServices.StaffService;

public class StaffServiceImp  {

    public StaffInterface<String, Student> recognise = (student)->{
        if (student.getGpa() >= 3.5 && student.getGpa() <= 5.0) {
            Student.listOfExcellentStudents.add(student);
            return "ScholarshipAwarded: First Class gotten";
        } else if (student.getGpa() > 2.0 && student.getGpa() < 3.5) {
            return "Second Class gotten";
        } else {
            return "Support: Student Failed";
        }
    };

    public StaffInterface<String, Student> expelOffence = (student)-> {
        //String offence = null;
        for (String offence : student.getOffence()) {
            switch (offence) {
                case "smoking":
                case "fighting":
                    System.out.println(student.getName() + " is suspended for 2 weeks for " + offence);
                    break;
                case "sexualMisconduct":
                case "examMalpractice":
                    System.out.println(student.getName() + "is expelled for " + offence);
                    return "Expelled for " + offence;
            }
        }
        return null;

    };



    public StaffInterface<String, Applicant> admitAge = (applicant)-> {
        if (applicant.getAge() >= 18) {
            return "Applicant.listOfApplicant.add(applicant)";
        } else {
            return null;
        }
    };

    public StaffService teachStudent = (teacher, student)->{
        if (teacher.getRole().equals(Role.mathematicsTeacher)) {
            return "Teachers are teaching their Students";
        } else {
            return "Teachers are not teaching their Students";
        }
    };
//        @Override
//    public String teachStudent(Teacher teacher, Student student) {
//        if (teacher.getRole().equals(Role.mathematicsTeacher)) {
//            return "Teachers are teaching their Students";
//        } else {
//            return "Teachers are not teaching their Students";
//        }
//    }

//    @Override
//    public String recognise(Student student) {
//        if (student.getGpa() >= 3.5 && student.getGpa() <= 5.0) {
//            Student.listOfExcellentStudents.add(student);
//            return "ScholarshipAwarded: First Class gotten";
//        } else if (student.getGpa() > 2.0 && student.getGpa() < 3.5) {
//            return "Second Class gotten";
//        } else {
//            return "Support: Student Failed";
//        }
//    }
//
//    @Override
//    public String expelOffence(Student student) {
//
//
//        //String offence = null;
//        for (String offence : student.getOffence()) {
//            switch (offence) {
//                case "smoking":
//                case "fighting":
//                    System.out.println(student.getName() + " is suspended for 2 weeks for " + offence);
//                    break;
//                case "sexualMisconduct":
//                case "examMalpractice":
//                    System.out.println(student.getName() + "is expelled for " + offence);
//                    return "Expelled for " + offence;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public String admitAge(Applicant applicant) {
//            if (applicant.getAge() >= 18) {
//                return "Applicant.listOfApplicant.add(applicant)";
//            } else {
//                return null;
//            }
//    }
}