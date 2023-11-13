package org.example.SchoolProject.utils;

import org.example.SchoolProject.entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

////StudentID,FirstName,LastName,GradeLevel,Email,GuardianEmail1,GuardianEmail2,isArchived,isDeleted
public class StudentUtil {
    public static List<Student> readStudentCSV(String fileName) {
        List<Student> listOfStudent = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String lines;
//          int counter = 0;
            boolean isFirstLine = true;
            while ((lines = reader.readLine()) != null) {
                String[] rows = lines.replaceAll(",", " ,").split(",");
                if (!isFirstLine) {

                    Student student = new Student();

                    System.out.println(Arrays.toString(rows));
                    student.setStudentIdNumber(Objects.equals(rows[0], "") || rows[0] == null ? null : Integer.parseInt(rows[0].trim()));
                    student.setFirstName(Objects.equals(rows[1], "") || rows[1] == null ? null : rows[1]);
                    student.setLastName(Objects.equals(rows[2], "") || rows[2] == null ? null : rows[2]);
                    student.setGradeLevel(Objects.equals(rows[3], "") || rows[3] == null ? null : rows[3]);
                    student.setEmail(Objects.equals(rows[4], "") || rows[4] == null ? null : rows[4]);
                    student.setGuardianEmail1(Objects.equals(rows[5], "") || rows[5] == null ? null : rows[5]);
                    student.setGuardianEmail2(Objects.equals(rows[6], "") || rows[6] == null ? null : rows[6]);
                    student.setIsArchived(Objects.equals(rows[7], "") || rows[7] == null ? null : rows[7]);

                    System.out.println(student);
                    listOfStudent.add(student);
                }
                isFirstLine = false;
//              counter++;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfStudent;
    }

}


























