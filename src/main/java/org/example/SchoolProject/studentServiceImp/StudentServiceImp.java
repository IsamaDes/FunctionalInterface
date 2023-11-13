package org.example.SchoolProject.studentServiceImp;

import org.example.SchoolProject.entity.Student;
import org.example.SchoolProject.entity.Teacher;
import org.example.SchoolProject.studentServices.StudentServices;

public class StudentServiceImp implements StudentServices {
    @Override
    public Student takeCourse(Teacher teacher, Student student) {
        if (student.getScore() >= 50) {
            Student.listOfStudent.add(student);
        }
        return student;

    }
}




