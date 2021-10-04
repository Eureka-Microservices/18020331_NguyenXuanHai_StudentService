package com.se.n18020331_nguyenxuanhai_student.service;

import com.se.n18020331_nguyenxuanhai_student.entity.Student;
import com.se.n18020331_nguyenxuanhai_student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        log.info("Inside saveStudent of Service! ");
        return studentRepository.save(student);
    }

    public Student findStudentById(Long studentId) {
        log.info("inside findStudentById ");
        return studentRepository.findById(studentId).get();
    }
}
