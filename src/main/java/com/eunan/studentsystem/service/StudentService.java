package com.eunan.studentsystem.service;
import com.eunan.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
public Student saveStudent(Student student);
public List<Student> getAllStudents();
}
