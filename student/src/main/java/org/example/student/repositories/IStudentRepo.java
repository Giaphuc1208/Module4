package org.example.student.repositories;

import org.example.student.models.Student;

import java.util.List;

public interface IStudentRepo {
    List<Student> findAll();

    void save(Student student);

    Student findById(Long id);

    void update(Student student);
}
