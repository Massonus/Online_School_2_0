package com.example.onlineschool_2_0.service;

import com.example.onlineschool_2_0.entity.Student;
import com.example.onlineschool_2_0.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void saveStudents(final Student student) {
        studentRepo.save(student);
    }
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudents(final Long id) {
        return studentRepo.findById(id);
    }

    public void createStudentsBeforeStart(String firstName, String lastName) {

        final Student student = new Student();

        student.setFirstName(firstName);
        student.setLastName(lastName);

    }
}
