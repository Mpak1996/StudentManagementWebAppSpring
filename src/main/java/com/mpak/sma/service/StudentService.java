package com.mpak.sma.service;

import com.mpak.sma.entity.Student;

import java.util.List;

public interface StudentService {

    void Homepage();

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);


}
