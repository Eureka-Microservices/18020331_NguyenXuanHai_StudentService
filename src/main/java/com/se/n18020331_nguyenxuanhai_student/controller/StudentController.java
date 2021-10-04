package com.se.n18020331_nguyenxuanhai_student.controller;

import com.se.n18020331_nguyenxuanhai_student.entity.Student;
import com.se.n18020331_nguyenxuanhai_student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/")
    public Student saveDeparment(@RequestBody Student student){
        log.info("inside saveStudent method if Student controller!");
        return studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Student findDeparmentById(@PathVariable("id") Long studentId){
        log.info("inside findStudentById method if Student controller!");
        return studentService.findStudentById(studentId);
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Nguyen Xuan Hai!";
    }
}
