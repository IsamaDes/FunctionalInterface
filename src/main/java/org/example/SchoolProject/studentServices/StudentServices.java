package org.example.SchoolProject.studentServices;

import org.example.SchoolProject.entity.Student;
import org.example.SchoolProject.entity.Teacher;

public interface StudentServices {
    Student takeCourse(Teacher teacher, Student student);

}
