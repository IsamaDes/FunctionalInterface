package org.example.SchoolProject.entity;
import lombok.*;
import org.example.SchoolProject.Enum.Student_Enums;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//StudentID,FirstName,LastName,GradeLevel,Email,GuardianEmail1,GuardianEmail2,isArchived,isDeleted

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User {
    public static List<Student> listOfStudent = new ArrayList<>();
    public static List<Student> listOfExcellentStudents = new ArrayList<>();
    private String firstName;
    private String lastName;
    private String gradeLevel;
    @Getter
    private String[] offence;
    private String guardianEmail1;

    public void setOffence() {
        this.offence = offence;
    }

    private String guardianEmail2;
    private String isArchived;
    private String isDeleted;
    private String email;
    private Student_Enums role;
    private Integer studentIdNumber;
    private LocalDate enrollmentDate;
    private double gpa;
    int score;
}