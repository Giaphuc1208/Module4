package org.example.student.services;

import org.example.student.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void save(Student student);
    Student findById(Long id);

    void update(Student student);
}
