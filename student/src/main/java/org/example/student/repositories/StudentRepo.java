package org.example.student.repositories;

import org.example.student.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepo implements IStudentRepo{
    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1L, "haiTT","QN", 9.0f));
        students.add(new Student(2L, "haiTT2","QN", 9.0f));
        students.add(new Student(3L, "haiTT3","QN", 9.0f));

    }
    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        student.setId(students.get(students.size()-1).getId() + 1);
        students.add(student);
    }

    @Override
    public Student findById(Long id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void update(Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                s.setName(student.getName());
                s.setAddress(student.getAddress());
                s.setScore(student.getScore());
                break;
            }
        }
    }
}