package org.example.SchoolProject.staffServiceImp;
import org.example.SchoolProject.Enum.Role;
import org.example.SchoolProject.Enum.Student_Enums;
import org.example.SchoolProject.entity.Applicant;
import org.example.SchoolProject.entity.Student;
import org.example.SchoolProject.entity.Teacher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StaffServiceImpTest {
    StaffServiceImp staffService = new StaffServiceImp();
    Student student = new Student();
    Teacher teacher = new Teacher();
    Applicant applicant = new Applicant();


    @Test
    void teachStudentTest1() {
        teacher.setRole(Role.mathematicsTeacher);
        student.setRole(Student_Enums.Mathematics_Student);
        assertEquals("Teachers are teaching their Students", staffService.teachStudent(teacher, student));
    }

    @Test
    void teachStudentTest2() {
        teacher.setRole(Role.biologyTeacher);
        student.setRole(Student_Enums.Mathematics_Student);
        assertEquals("Teachers are not teaching their Students", staffService.teachStudent(teacher, student));
    }

    @Test
    void recogniseTest3() {
        student.setGpa(4.0);
        assertEquals("ScholarshipAwarded: First Class gotten", staffService.recognise(student));
    }

    @Test
    void recogniseTest4() {
        student.setGpa(2.5);
        assertEquals("Second Class gotten", staffService.recognise(student));
    }

    @Test
    void recogniseTest5() {
        student.setGpa(1.5);
        assertEquals("Support: Student Failed", staffService.recognise(student));
    }


//    @Test
//    void expelOffenceTest6() {
//
//        student.setOffence(new String[]{"smoking"});
//        assertEquals(student.getName() + " is suspended for 2 weeks for " + offence, staffService.expelOffence(student));
//
//        student.setOffence(new String[]{"sexualMisconduct"});
//        assertEquals(student.getName() + "is expelled for " + offence, staffService.expelOffence(student));
//
//        student.setOffence();
//        assertEquals(null, staffService.expelOffence(student));
//    }

    @Test
    void admitAgeTest7() {
        applicant.setAge(15);
        assertEquals(null, staffService.admitAge(applicant));
    }

    @Test
    void admitAgeTest8() {
        applicant.setAge(21);
        assertEquals("Applicant.listOfApplicant.add(applicant)", staffService.admitAge(applicant));
    }
}













