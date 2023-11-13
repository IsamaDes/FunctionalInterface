package org.example.SchoolProject.utils;

import org.example.SchoolProject.entity.Student;
import org.example.SchoolProject.entity.Teacher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TeacherUtil {
    public static List<Teacher> readTeacherCSV(String fileName) {
        List<Teacher> listOfTeacher = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String lines;
//          int counter = 0;
            boolean isFirstLine = true;
            while ((lines = reader.readLine()) != null) {
                String[] rows = lines.replaceAll(",", " ,").split(",");
                if (!isFirstLine) {
                    Teacher teacher = new Teacher();
                    System.out.println(Arrays.toString(rows));
                    teacher.setTeacherIdNumber(Objects.equals(rows[0], "") || rows[0] == null ? null : rows[0].trim());
                    teacher.setFirstName(Objects.equals(rows[1], "") || rows[1] == null ? null : rows[1]);
                    teacher.setLastName(Objects.equals(rows[2], "") || rows[2] == null ? null : rows[2]);
                    teacher.setEmail(Objects.equals(rows[3], "") || rows[3] == null ? null : rows[3]);
                    System.out.println(teacher);
                    listOfTeacher.add(teacher);
                }
                isFirstLine = false;
//              counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfTeacher;
    }
}


